package ru.kpfu.itis.ALINA_TLITOVA.forms;

import org.hibernate.validator.constraints.NotEmpty;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author Alina Tlitova
 *         11-402
 */

public class MessageForm {
    @NotEmpty(message = "Заполните поле")
    @Pattern(message = "Допустимы только символы кириллицы и цифры", regexp = "^[а-яА-Я]{3,20}")
    @Size(min = 3, max = 1000, message = "Минимальная длина - 3 символа, максимальная - 20")
    private String theme;

    @NotEmpty(message = "Заполните поле")
    @Pattern(message = "Допустимы только символы кириллицы и цифры", regexp = "^[а-яА-Я]{3,1000}")
    @Size(min = 3, max = 1000, message = "Минимальная длина - 3 символа, максимальная - 1000")
    private String text;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
