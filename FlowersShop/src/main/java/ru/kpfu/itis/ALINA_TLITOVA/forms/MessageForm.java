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
//    @Pattern(message = "Допустимы только символы кириллицы и знаки пунктуации",
//            regexp = "^[а-яА-Я1-9-\\.\\,\\?\\!\\(\\)\\:\\;/\\s]{3,20}")
    @Size(min = 3, max = 1000, message = "Минимальная длина - 3 символа, максимальная - 20")
    private String theme;

    @NotEmpty(message = "Заполните поле")
//    @Pattern(message = "Допустимы только символы кириллицы и знаки пунктуации",
//            regexp = "^[а-яА-Я1-9-\\.\\,\\?\\!\\(\\)\\:\\;/\\s]{3,1000}")
    @Size(min = 3, max = 1000, message = "Минимальная длина - 3 символа, максимальная - 1000")
    private String text;

    private String date;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
