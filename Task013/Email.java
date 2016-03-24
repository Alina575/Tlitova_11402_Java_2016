package ru.kpfu.itis.alina.models;

/**
 * @author Alina Tlitova
 *         11-402
 *         013
 */

public class Email {
    private String address;

    public Email() {
    }

    public Email(String address) {
        this.address = address;
    }

    public String getEmail() {
        return address;
    }

    public void setEmail(String address) {
        this.address = address;
    }
}
