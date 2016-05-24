package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.ALINA_TLITOVA.forms.RegistrationForm;
import ru.kpfu.itis.ALINA_TLITOVA.models.Role;
import ru.kpfu.itis.ALINA_TLITOVA.services.UserService;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

import javax.validation.Valid;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Controller
public class RegistrationController {
    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Autowired
    UserService userService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String regGet() {
        return "registration";
    }


    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String regPost(@RequestParam String login, @RequestParam String password,
                          @RequestParam String confpassword, @RequestParam String email) {
        if (password.equals(confpassword)) {
            if (userService.getByLogin(login) == null) {
                User user = new User();
                user.setLogin(login);
                user.setPassword(bCryptPasswordEncoder.encode(password));
                user.setEmail(email);
                user.setRole(Role.ROLE_BUYER);
                userService.save(user);
                System.out.println("**********" + userService.getByLogin(user.getLogin()).getLogin() + " " + user.getPassword());
                return "login";
            } else {
                return "registration";
            }
        } else {
            return "registration";
        }
    }
}
