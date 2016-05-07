package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Alina Tlitova
 *         11-402
 *         03.05.2016
 */

@Controller
@RequestMapping("/private_adv")
public class PrivateAdvController {

    @RequestMapping(method = RequestMethod.GET)
    public String processGet(ModelMap model) {
        return "private_adv";
    }
}
