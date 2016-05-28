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

    @RequestMapping(value = "/add_product", method = RequestMethod.POST)
    public void addProduct(@RequestParam String user_id, @RequestParam String name,
                           @RequestParam String type, @RequestParam String price,
                           @RequestParam String descr, @RequestParam String number,
                           @RequestParam String date) {

        Product product = new Product();
        product.setUser(userService.getById(Integer.parseInt(user_id)));
        product.setName(name);
        product.setType(type);
        product.setPrice(Integer.parseInt(price));
        product.setDescr(descr);
        product.setNumber(number);
        product.setDate(date);
        productService.save(product);
    }

    @RequestMapping(value = "/add_message", method = RequestMethod.POST)
    public void addMessage(@RequestParam String user_id, @RequestParam String theme,
                           @RequestParam String text, @RequestParam String date) {
        Message message = new Message();
        message.setUser(userService.getById(Integer.parseInt(user_id)));
        message.setTheme(theme);
        message.setText(text);
        message.setDate(date);
        messageService.save(message);
    }
}