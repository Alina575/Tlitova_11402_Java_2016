package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * @author Alina Tlitova
 *         11-402
 *         24.04.2016
 */

@Controller
@RequestMapping(value = "/login")
public class LoginController {
    @RequestMapping(method = RequestMethod.GET)
    public String getLogin(HttpServletResponse response,
                           @RequestParam(value = "error", required = false) String error,
                           Model model) {
        if (Objects.equals(error, "true")) {
            model.addAttribute("error", error);
        }

        return "login";
    }
    /*
    @RequestMapping(method = RequestMethod.GET)
    public String getLogin(@RequestParam(value = "error", required = false) String error, Model model) {
        if (Objects.equals(error, "true")) {
            model.addAttribute("error", error);
        }
        return "login";

    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String getLoginPage(@RequestParam(value = "error", required = false) Boolean error, Model model) {
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("error", error);
        }
        return "login";
    }
    */
}


