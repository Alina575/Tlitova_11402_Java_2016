package ru.kpfu.itis.ALINA_TLITOVA.connection;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

import java.io.IOException;
import java.util.Base64;
import java.util.Collections;

/**
 * @author Alina Tlitova
 *         11-402
 */

public class Connection {
    private RestTemplate restTemplate;
    private String serverURL = "http://localhost:8080/rest/api";
    private String data;

    public Connection() {
        restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(Collections.<HttpMessageConverter<?>>singletonList(new MappingJacksonHttpMessageConverter()));
    }

    public User auth(String username, String password) {
        RestTemplate restTemplate = new RestTemplate();
        String url = serverURL + "/" + username;
        byte[] bytes = (username + ":" + password).getBytes();
        data = "Basic " + Base64.getEncoder().encodeToString(bytes);
        try {
            return restTemplate.exchange(url, HttpMethod.GET, request(), User.class).getBody();
        } catch (Exception e) {
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private HttpEntity request() throws IOException {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", data);
        return new HttpEntity(httpHeaders);
    }
}
