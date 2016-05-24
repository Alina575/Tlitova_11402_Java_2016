package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.ALINA_TLITOVA.forms.DeliveryForm;
import ru.kpfu.itis.ALINA_TLITOVA.forms.ProductForm;
import ru.kpfu.itis.ALINA_TLITOVA.forms.RegistrationForm;
import ru.kpfu.itis.ALINA_TLITOVA.models.Flower;
import ru.kpfu.itis.ALINA_TLITOVA.services.DeliveryService;
import ru.kpfu.itis.ALINA_TLITOVA.services.FlowerService;
import ru.kpfu.itis.ALINA_TLITOVA.services.ProductService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 *         18.04.2016
 */

@Controller
public class ProductsController {

    @Autowired
    ProductService productService;

    @Autowired
    FlowerService flowerService;

    @RequestMapping(value = "/products/all", method = RequestMethod.GET)
    public String processGet(ModelMap model) {
        return "products";
    }

//    @RequestMapping(value = "/products/{name}", method = RequestMethod.GET)
//    public String showCurrent(ModelMap model) {
//        return "products";
//    }

    @RequestMapping(method = RequestMethod.POST)
    public String getProductAdding(@ModelAttribute("prodform") @Valid ProductForm productForm, BindingResult result) {
        if (result.hasErrors()) {
            return "products";
        }
        productService.saveProduct(productForm);
        return "redirect:/";
    }

    @RequestMapping(value = "/products/{name}", method = RequestMethod.GET)
    public String flowersShopPage(@RequestParam(required = false) String name, @RequestParam(required = false) String search, ModelMap map) {
        List<Flower> flowers = null;
        if (name != null) {
            flowers = flowerService.getAllByName(name);

            if (flowers == null) {
                if (search != null) {
                    flowers = flowerService.search(search);
                } else {
                    flowers = new ArrayList<>();
                }
            }
        }
        map.put("flowers", flowers);
        map.addAttribute("prodform", new ProductForm());
        return "products";
    }
}