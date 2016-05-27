package ru.kpfu.itis.ALINA_TLITOVA.connection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.kpfu.itis.ALINA_TLITOVA.models.Product;
import ru.kpfu.itis.ALINA_TLITOVA.models.Role;

import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public class Connection {
    private RestTemplate restTemplate;
    private String serverURL = "http://localhost:8080/api/";
    private String data = null;

    public Role getRole() throws Exception, IOException {
        restTemplate = new RestTemplate();
        ResponseEntity responseEntity = restTemplate.exchange(serverURL + "role",
                HttpMethod.GET, request("role"), String.class);
        return objectMapper().readValue(responseEntity.getBody().toString(), Role.class);
    }

    public List<Product> getAllProducts() throws Exception, IOException {
        ResponseEntity responseEntity = restTemplate.exchange(serverURL + "products",
                HttpMethod.GET, request("products"), String.class);
        return Arrays.asList(objectMapper().readValue(responseEntity.getBody().toString(), Product[].class));
    }

    public void addProduct(Product product) throws IOException {
        new RestTemplate().exchange(serverURL + "add_product", HttpMethod.POST, request(product), product.getClass());
    }


    public void auth(String login, String password) throws Exception {
        byte[] bytes = (login + ":" + password).getBytes();
        data = "Basic " + Base64.getEncoder().encodeToString(bytes);
    }


    private ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        return mapper;
    }

    private HttpEntity request(Object o) throws IOException {
        HttpHeaders httpHeaders = new HttpHeaders();
        if (data != null) {
            httpHeaders.add("Authorization", data);
        }
        return new HttpEntity(o, httpHeaders);
    }
}
