package ru.kpfu.itis.ALINA_TLITOVA.forms;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author Alina Tlitova
 *         11-402
 */

public class ProductForm {
    @NotEmpty(message = "Заполните поле")
    @Pattern(message = "Допустимы только символы кириллицы", regexp = "^[а-яА-Я]{2,15}")
    @Size(min = 2, max = 15, message = "Минимальная длина - 2 символа, максимальная - 15")
    private String name;

    @NotEmpty(message = "Заполните поле")
    @Pattern(message = "Допустимы только символы кириллицы", regexp = "^[а-яА-Я]{2,15}")
    @Size(min = 2, max = 15, message = "Минимальная длина - 2 символа, максимальная - 15")
    private String type;

    @NotEmpty(message = "Заполните поле")
    @Pattern(message = "Допустимы только цифры", regexp = "^[1-9]{2,5}")
    @Size(min = 2, max = 30, message = "Минимальная длина - 2 символа, максимальная - 30")
    private Integer price;

    @NotEmpty(message = "Заполните поле")
    @Pattern(message = "Допустимы только символы кириллицы и знаки пунктуации",
            regexp = "^[а-яА-Я1-9-\\.\\,\\?\\!\\(\\)\\:\\;]{10,1000}")
    @Size(min = 10, max = 1000, message = "Минимальная длина - 10 символа, максимальная - 1000")
    private String descr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
