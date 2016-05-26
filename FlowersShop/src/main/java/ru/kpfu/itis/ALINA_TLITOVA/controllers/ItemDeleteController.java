package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

/**
 * @author Alina Tlitova
 *         11-402
 *         03.05.2016
 */

@Controller
public class ItemDeleteController {

    @RequestMapping(value = "/item_delete", method = RequestMethod.GET)
    public String processGet(ModelMap model) {

        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() != "anonymousUser") {
            User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            String role = String.valueOf(user.getRole());
            model.addAttribute("username", user.getLogin());
        } else {
            model.addAttribute("username", null);
        }


        return "shopping_cart";
    }

}
