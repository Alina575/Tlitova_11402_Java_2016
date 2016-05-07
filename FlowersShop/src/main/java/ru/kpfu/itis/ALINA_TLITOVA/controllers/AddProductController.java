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
import ru.kpfu.itis.ALINA_TLITOVA.forms.DeliveryForm;
import ru.kpfu.itis.ALINA_TLITOVA.forms.ProductForm;
import ru.kpfu.itis.ALINA_TLITOVA.forms.RegistrationForm;
import ru.kpfu.itis.ALINA_TLITOVA.services.ProductService;
import ru.kpfu.itis.ALINA_TLITOVA.services.UserService;

import javax.validation.Valid;

/**
 * @author Alina Tlitova
 *         11-402
 *         24.04.2016
 */

@Controller
@RequestMapping("/add_product")
public class AddProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPage(Model model) {
        model.addAttribute("delform", new ProductForm());
        return "add_product";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String getProduct(@ModelAttribute("delform") @Valid ProductForm form) {
        productService.saveProduct(form);
        return "redirect:/products";
    }
}
