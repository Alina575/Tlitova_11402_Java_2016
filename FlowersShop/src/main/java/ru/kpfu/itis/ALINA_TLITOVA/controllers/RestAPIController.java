package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.itis.ALINA_TLITOVA.models.Message;
import ru.kpfu.itis.ALINA_TLITOVA.models.Product;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;
import ru.kpfu.itis.ALINA_TLITOVA.services.*;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

@RestController
@RequestMapping("/rest/api")
public class RestAPIController {

    @Autowired
    UserService userService;

    @Autowired
    ArticleService articlesService;

    @Autowired
    OrderService orderService;

    @Autowired
    ProductService productService;

    @Autowired
    MessageService messageService;

    @RequestMapping(value = "/{login}", method = RequestMethod.GET)
    public
    @ResponseBody
    User getUser(@PathVariable String login) {
        return userService.getByLogin(login);
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Product> getProducts() {
        return productService.getAll();
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public List<Product> getOrders() {
        return productService.getAll();
    }

    @RequestMapping(value = "/articles", method = RequestMethod.GET)
    public List<Product> getArticles() {
        return productService.getAll();
    }

    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    public List<Message> getMessages() {
        return messageService.getAll();
    }

//    @RequestMapping(value = "/add_product", method = RequestMethod.POST)
//    public List<Product> getAddProduct() {
//        return productService.getAll();
//    }
//
//    @RequestMapping(value = "/add_message", method = RequestMethod.POST)
//    public List<Message> getAddMessage() {
//        return messageService.getAll();
//    }
}