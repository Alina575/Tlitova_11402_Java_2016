package ru.kpfu.itis.ALINA_TLITOVA.connection;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

/**
 * @author Alina Tlitova
 *         11-402
 */

public class CustomResponseErrorHandler {
    private ResponseErrorHandler errorHandler = new DefaultResponseErrorHandler();

    public boolean hasError(ClientHttpResponse response) throws IOException {
        return errorHandler.hasError(response);
    }

    public void handleError(ClientHttpResponse response) throws IOException {
        throw new Exception(response.getStatusCode());
    }
}
