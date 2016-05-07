package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alina Tlitova
 *         11-402
 *         27.04.2016
 */

@Controller
@RequestMapping("/")
public class MediatorController {

    @RequestMapping
    public String getHomePage() {
        return "home";
    }

    @RequestMapping(value = "/user")
    public String getUserPage() {
        return "user";
    }

    @RequestMapping(value = "/admin")
    public String getAdminPage() {
        return "admin";
    }
}