package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.kpfu.itis.ALINA_TLITOVA.forms.DeliveryForm;
import ru.kpfu.itis.ALINA_TLITOVA.forms.RegistrationForm;
import ru.kpfu.itis.ALINA_TLITOVA.models.Delivery;
import ru.kpfu.itis.ALINA_TLITOVA.services.DeliveryService;
import ru.kpfu.itis.ALINA_TLITOVA.services.UserService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Controller
@RequestMapping(value = "/delivery", method = RequestMethod.GET)
public class DeliveryController {

    @Autowired
    DeliveryService deliveryService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPage(Model model) {
        model.addAttribute("delform", new RegistrationForm());
        return "delivery";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String getDelivery(@ModelAttribute("delform") @Valid DeliveryForm deliveryForm, BindingResult result) {
        if (result.hasErrors()) {
            return "delivery";
        }
        deliveryService.saveDelivery(deliveryForm);
        return "redirect:/";
    }

    @RequestMapping(value = "/deliveryDetails.pdf", method = RequestMethod.GET)
    public ModelAndView downloadPDF(@ModelAttribute("delform") @Valid DeliveryForm deliveryForm) {
              return new ModelAndView("pdfView", "deliveryDetails", deliveryForm);
    }
}
