package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

/**
 * @author Alina Tlitova
 *         11-402
 *         18.04.2016
 */

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String returnIndex() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication.getPrincipal() != "anonymousUser") {
            User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            String role = String.valueOf(user.getRole());
            if (role.equals("ROLE_SELLER")) {
                return "redirect:/add_product";
            }

            if (role.equals("ROLE_BUYER")) {
                return "redirect:/";
            }
        }
        return "index";
    }
}
