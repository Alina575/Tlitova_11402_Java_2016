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
    @Pattern(message = "Допустимы только символы кириллицы", regexp = "^[а-яА-Я]{2,15}")
    @Size(min = 2, max = 15, message = "Минимальная длина - 2 символа, максимальная - 15")
    private String name;

    @Pattern(message = "Допустимы только символы кириллицы", regexp = "^[а-яА-Я]{2,15}")
    @Size(min = 2, max = 15, message = "Минимальная длина - 2 символа, максимальная - 15")
    private String type;

    private Integer price;

    @Pattern(message = "Допустимы только символы кириллицы и знаки пунктуации",
            regexp = "^[а-яА-Я1-9-\\.\\,\\?\\!\\(\\)\\:\\;/\\s]{10,1000}")
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
