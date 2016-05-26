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
    @NotEmpty
    @Pattern(message = "Допустимы латинские символы или цифры", regexp = "^[a-zA-Z0-9_-]{3,16}")
    @Size(min = 3, message = "Минимальная длина логина - 3 символа")
    private String login;

    @NotEmpty
    @Size(min = 4, message = "Минимальная длина пароля - 4 символа")
    private String password;

    private String confpassword;

    @NotEmpty
//    @Pattern(message = "Некорректный e-mail", regexp = "([a-z0-9_\\.-])+@[a-z0-9-]+\\.([a-z]{2,4}\\.)?[a-z]{2,4}")
    @Size(min = 5, max = 11, message = "Минимальная длина номера - 5 символов, максимальная - 11")
    private String phone;

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

    public String getConfpassword() {
        return confpassword;
    }

    public void setConfpassword(String confpassword) {
        this.confpassword = confpassword;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}