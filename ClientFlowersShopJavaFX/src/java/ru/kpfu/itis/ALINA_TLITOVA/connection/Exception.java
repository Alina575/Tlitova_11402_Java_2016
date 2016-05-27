package ru.kpfu.itis.ALINA_TLITOVA.connection;

import org.springframework.http.HttpStatus;

/**
 * @author Alina Tlitova
 *         11-402
 */

public class Exception extends RuntimeException {

    private HttpStatus statusCode;

    public Exception(HttpStatus status) {
        statusCode = status;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }
}

