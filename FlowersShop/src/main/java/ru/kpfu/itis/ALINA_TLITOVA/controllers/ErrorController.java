package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Controller
public class ErrorController {

    @RequestMapping(value = "/error404", method = RequestMethod.GET)
    public String render404ErrorPage(){
        return "error-pages/404";
    }

    @RequestMapping(value = "/error403", method = RequestMethod.GET)
    public String render403ErrorPage(){
        return "error-pages/403";
    }

    @RequestMapping(value = "/error500", method = RequestMethod.GET)
    public String render500ErrorPage(){
        return "errorPages/500";
    }
}
