package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Alina Tlitova
 *         11-402
 *         24.04.2016
 */

@Controller
public class AboutFlowersController {

    @RequestMapping(value = "/about_flowers", method = RequestMethod.GET)
    public String processGet(ModelMap model) {
        return "about_flowers";
    }

}