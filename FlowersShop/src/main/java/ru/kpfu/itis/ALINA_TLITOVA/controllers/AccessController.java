package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Alina Tlitova
 *         11-402
 *         27.04.2016
 */

@Controller
@RequestMapping
public class AccessController {

    @RequestMapping("/login")
    public String login(Model model, @RequestParam(required = false) String message) {
        model.addAttribute("message", message);
        return "access/login";
    }

    @RequestMapping(value = "/denied")
    public String denied() {
        return "access/denied";
    }

    @RequestMapping(value = "/login/failure")
    public String loginFailure() {
        String message = "Login Failure!";
        return "redirect:/login?message=" + message;
    }

    @RequestMapping(value = "/logout/success")
    public String logoutSuccess() {
        String message = "Logout Success!";
        return "redirect:/login?message=" + message;
    }
}