package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.ALINA_TLITOVA.forms.RegistrationForm;
import ru.kpfu.itis.ALINA_TLITOVA.services.UserService;

import javax.validation.Valid;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPage(Model model) {
        model.addAttribute("regform", new RegistrationForm());
        return "registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String getRegistration(@ModelAttribute("regform") @Valid RegistrationForm form, BindingResult result) {
        if (userService.getByLogin(form.getLogin()) != null) {
            result.addError(new FieldError("regform", "login", "Логин уже занят"));
        }
        if (result.hasErrors()) {
            return "registration";
        }

        userService.saveUser(form);
        return "redirect:/login";
    }

}
