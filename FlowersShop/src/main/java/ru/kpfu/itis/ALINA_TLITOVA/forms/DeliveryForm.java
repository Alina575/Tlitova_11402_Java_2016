package ru.kpfu.itis.ALINA_TLITOVA.forms;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author Alina Tlitova
 *         11-402
 */

public class DeliveryForm {
    @Pattern(message = "Допустимы только символы кириллицы", regexp = "^[а-яА-Я]{2,30}")
    @Size(min = 2, max = 30, message = "Минимальная длина - 2 символа, максимальная - 30")
    private String secondname;

    @Pattern(message = "Допустимы только символы кириллицы", regexp = "^[а-яА-Я]{2,30}")
    @Size(min = 2, max = 30, message = "Минимальная длина - 2 символа, максимальная - 30")
    private String name;

    @Pattern(message = "Допустимы только символы кириллицы", regexp = "^[а-яА-Я]{2,30}")
    @Size(min = 2, max = 30, message = "Минимальная длина - 2 символа, максимальная - 30")
    private String lastname;

    @Pattern(message = "Допустимы только символы кириллицы", regexp = "^[а-яА-Я]{2,30}")
    @Size(min = 2, max = 30, message = "Минимальная длина - 2 символа, максимальная - 30")
    private String country;

    @Pattern(message = "Допустимы только символы кириллицы", regexp = "^[а-яА-Я]{2,30}")
    @Size(min = 2, max = 30, message = "Минимальная длина - 2 символа, максимальная - 30")
    private String city;

    @Pattern(message = "Допустимы только символы кириллицы", regexp = "^[а-яА-Я]{2,30}")
    @Size(min = 2, max = 30, message = "Минимальная длина - 2 символа, максимальная - 30")
    private String street;

    @Pattern(message = "Допустимы только цифры и символы кириллицы", regexp = "^[1-9а-яА-Я]{1,3}")
    @Size(min = 1, max = 3, message = "Минимальная длина - 1 символ, максимальная - 3")
    private String house;

    @Pattern(message = "Допустимы только цифры", regexp = "^[1-9]{1,4}")
    @Size(min = 1, max = 4, message = "Минимальная длина - 1 символ, максимальная - 4")
    private String flat;

    @Pattern(message = "Допустимы только цифры", regexp = "^[1-9]{5,11}")
    @Size(min = 5, max = 11, message = "Минимальная длина - 5 символов, максимальная - 11")
    private String phone;

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
