package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.ALINA_TLITOVA.forms.MessageForm;
import ru.kpfu.itis.ALINA_TLITOVA.forms.ProductForm;
import ru.kpfu.itis.ALINA_TLITOVA.forms.RegistrationForm;
import ru.kpfu.itis.ALINA_TLITOVA.services.DeliveryService;
import ru.kpfu.itis.ALINA_TLITOVA.services.MessageService;

import javax.validation.Valid;

/**
 * @author Alina Tlitova
 *         11-402
 *         24.04.2016
 */

@Controller
@RequestMapping("/contacts")
public class ContactsController {

    @Autowired
    MessageService messageService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPage(Model model) {
        model.addAttribute("prodform", new RegistrationForm());
        return "contacts";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String getProductAdding(@ModelAttribute("mesform") @Valid MessageForm messageForm, BindingResult result) {
        if (result.hasErrors()) {
            return "contacts";
        }
        messageService.saveMessage(messageForm);
        return "redirect:/";
    }

}
