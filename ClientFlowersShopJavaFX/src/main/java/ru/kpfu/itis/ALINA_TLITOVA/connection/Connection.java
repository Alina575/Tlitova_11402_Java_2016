package ru.kpfu.itis.ALINA_TLITOVA.connection;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import ru.kpfu.itis.ALINA_TLITOVA.models.*;

import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

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

    public void addProduct(User user, String name, String type, String price, String descr, String number, String date) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        String url = serverURL + "/add_product?userId=" + user.getId() + "&name=" + name +
                "&type=" + type + "&price=" + price + "&descr=" + descr + "&number=" + number + "&date=" + date;
        restTemplate.exchange(url, HttpMethod.POST, request(), Product.class);
    }

    public void addMessage(User user, String theme, String text, String date) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        String url = serverURL + "/add_message?userId=" + user.getId() + "&theme=" + theme +
                "&text=" + text + "&date=" + date;
        restTemplate.exchange(url, HttpMethod.POST, request(), Message.class);
    }

    public List<Product> getProducts() {
        RestTemplate restTemplate = new RestTemplate();
        String url = serverURL + "/products";
        return restTemplate.getForObject(url, List.class);
    }

    public List<Article> getArticles() {
        RestTemplate restTemplate = new RestTemplate();
        String url = serverURL + "/articles";
        return restTemplate.getForObject(url, List.class);
    }

    public List<Order> getOrders() {
        RestTemplate restTemplate = new RestTemplate();
        String url = serverURL + "/articles";
        return restTemplate.getForObject(url, List.class);
    }

    public List<Message> getMessages() {
        RestTemplate restTemplate = new RestTemplate();
        String url = serverURL + "/messages";
        return restTemplate.getForObject(url, List.class);
    }

    private HttpEntity request() throws IOException {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", data);
        return new HttpEntity(httpHeaders);
    }

    public void logout() {
        String url = "http://localhost:8080/logout";
        restTemplate.delete(url);
    }
}
