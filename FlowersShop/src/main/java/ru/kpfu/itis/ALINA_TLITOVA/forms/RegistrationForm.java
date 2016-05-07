package ru.kpfu.itis.ALINA_TLITOVA.forms;

import org.hibernate.validator.constraints.NotEmpty;
import ru.kpfu.itis.ALINA_TLITOVA.models.Role;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author Alina Tlitova
 *         11-402
 */

public class RegistrationForm {
    @NotEmpty(message = "Заполните поле")
    @Pattern(message = "Допустимы латинские символы или цифры", regexp = "^[a-zA-Z0-9_-]{3,16}")
    @Size(min = 6, message = "Минимальная длина логина - 3 символа")
    private String login;

    @NotEmpty(message = "Заполните поле")
    @Size(min = 6, message = "Минимальная длина пароля - 4 символа")
    private String password;

    @NotEmpty(message = "Заполните поле")
    @Size(min = 6, message = "Повторите пароль ещё раз")
    private String passwordConf;

    @NotEmpty(message = "Заполните поле")
    @Pattern(message = "Некорректный e-mail", regexp = "([a-z0-9_\\\\.-])+@[a-z0-9-]+\\\\.([a-z]{2,4}\\\\.)?[a-z]{2,4}")
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConf() {
        return passwordConf;
    }

    public void setPasswordConf(String passwordConf) {
        this.passwordConf = passwordConf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}