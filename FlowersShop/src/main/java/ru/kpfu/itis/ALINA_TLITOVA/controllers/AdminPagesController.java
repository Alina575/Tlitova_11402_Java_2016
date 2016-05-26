package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.ALINA_TLITOVA.models.Message;
import ru.kpfu.itis.ALINA_TLITOVA.models.Order;
import ru.kpfu.itis.ALINA_TLITOVA.models.Sale;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;
import ru.kpfu.itis.ALINA_TLITOVA.services.*;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */
@Controller
public class AdminPagesController {
    private Integer id;
    private String login;
    private String role;

    @Autowired
    UserService userService;

    @Autowired
    SaleService saleService;

    @Autowired
    DeliveryService deliveryService;

    @Autowired
    ArticleService articleService;

    @Autowired
    MessageService messageService;

    @Autowired
    ProductService productService;

    @Autowired
    FlowerService flowerService;

    @Autowired
    OrderService orderService;

    @Autowired
    ShoppingCartItemService shoppingCartItemService;

    private ModelMap creating(ModelMap model) {

        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() != "anonymousUser") {
            User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            id = user.getId();
            login = String.valueOf(user.getLogin());
            role = String.valueOf(user.getRole());
            model.addAttribute("username", user.getLogin());
        } else {
            model.addAttribute("username", null);
        }

        Sale s = saleService.getById(1);
        model.addAttribute("salename", s.getFlower().getName());
        model.addAttribute("saletype", s.getFlower().getType());
        model.addAttribute("saleimg", s.getFlower().getImg());
        model.addAttribute("newprice", s.getNewPrice());
        model.addAttribute("oldprice", s.getFlower().getPrice());

        return model;
    }


    @RequestMapping(value = "/admin_orders", method = RequestMethod.GET)
    public String getOrdersOfUsers(ModelMap model) {
        model = creating(model);
        List<Order> orders = orderService.getAll();
        model.addAttribute("orders", orders);
        return "admin_orders";
    }

    @RequestMapping(value = "/admin_messages", method = RequestMethod.GET)
    public String getMessagesOfUsers(ModelMap model) {
        model = creating(model);
        List<Message> messages = messageService.getAll();
        model.addAttribute("messages", messages);
        return "admin_messages";
    }
}