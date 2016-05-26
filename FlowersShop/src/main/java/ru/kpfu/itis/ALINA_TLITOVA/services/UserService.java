package ru.kpfu.itis.ALINA_TLITOVA.services;

import org.springframework.security.core.userdetails.UserDetails;
import ru.kpfu.itis.ALINA_TLITOVA.forms.RegistrationForm;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 *         18.04.2016
 */

public interface UserService {

    List<User> getAll();

    User getById(Integer id);

    User getByLogin(String login);

    User save(User user);

    void saveUser(RegistrationForm registrationForm);
    }
