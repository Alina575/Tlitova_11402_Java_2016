package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.itis.ALINA_TLITOVA.forms.DeliveryForm;
import ru.kpfu.itis.ALINA_TLITOVA.forms.MessageForm;
import ru.kpfu.itis.ALINA_TLITOVA.forms.ProductForm;
import ru.kpfu.itis.ALINA_TLITOVA.forms.RegistrationForm;
import ru.kpfu.itis.ALINA_TLITOVA.models.*;
import ru.kpfu.itis.ALINA_TLITOVA.services.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author Alina Tlitova
 *         11-402
 *         18.04.2016
 */

@Controller
@SessionAttributes(types = ProductForm.class)
public class MainController {
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

            if (role.equals("ROLE_ADMIN")) {
                model.addAttribute("admin", "admin");
                Sale s = saleService.getById(1);
                model.addAttribute("salename", s.getFlower().getName());
                model.addAttribute("saletype", s.getFlower().getType());
                model.addAttribute("saleimg", s.getFlower().getImg());
                model.addAttribute("newprice", s.getNewPrice());
                model.addAttribute("oldprice", s.getFlower().getPrice());
                model.addAttribute("username", user.getLogin());

                model.addAttribute("menu", "<li><a href=\"/products/rose\">Розы</a></li>\n" +
                        "<li><a href=\"/products/tulip\">Тюльпаны</a></li>\n" +
                        "<li><a href=\"/products/orchid\">Орхидеи</a></li>\n" +
                        "<li><a href=\"/products/carnation\">Гвоздики</a></li>\n" +
                        "<li><a href=\"/products/irise\">Ирисы</a></li>\n" +
                        "<li><a href=\"/products/chrysant\">Хризантемы</a></li>\n" +
                        "<li><a href=\"/products/alstroemeria\">Альстромерии</a></li>\n" +
                        "<li><a href=\"/products/other\">Другие</a></li>\n");
                return model;
            } else {
                model.addAttribute("admin", null);
            }

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

        model.addAttribute("menu", "<li><a href=\"/products/rose\">Розы</a></li>\n" +
                "<li><a href=\"/products/tulip\">Тюльпаны</a></li>\n" +
                "<li><a href=\"/products/orchid\">Орхидеи</a></li>\n" +
                "<li><a href=\"/products/carnation\">Гвоздики</a></li>\n" +
                "<li><a href=\"/products/irise\">Ирисы</a></li>\n" +
                "<li><a href=\"/products/chrysant\">Хризантемы</a></li>\n" +
                "<li><a href=\"/products/alstroemeria\">Альстромерии</a></li>\n" +
                "<li><a href=\"/products/other\">Другие</a></li>\n");

        return model;
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String returnIndex(ModelMap model) {
        /*
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication.getPrincipal() != "anonymousUser") {
            User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            String role = String.valueOf(user.getRole());
            if (role.equals("ROLE_SELLER")) {
                return "redirect:/add_product";
            }

            if (role.equals("ROLE_BUYER")) {
                return "redirect:/";
            }
        }
        */
        model = creating(model);

        return "index";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin(@RequestParam(value = "error", required = false) String error, ModelMap model) {
        if (Objects.equals(error, "true")) {
            model.addAttribute("error", error);
        }

        model = creating(model);
        return "login";

    }


    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getClientRegistrationPage(ModelMap model) {
        model = creating(model);
        model.addAttribute("regform", new RegistrationForm());
        return "registration";
    }


    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String getClientRegistration(ModelMap model, @ModelAttribute("regform") @Valid RegistrationForm form, BindingResult result) {
        model = creating(model);
        if (userService.getByLogin(form.getLogin()) != null) {
            result.addError(new FieldError("regform", "login", "Логин уже используется"));
        }
        if (!form.getPassword().equals(form.getConfpassword())) {
            result.addError(new FieldError("regform", "confpassword", "Подтвердите пароль корректно"));
        }

        if (result.hasErrors()) {
            return "registration";
        }

        userService.saveUser(form);
        return "redirect:/login";
    }

    @RequestMapping(value = "/about_flowers", method = RequestMethod.GET)
    public String processGet(ModelMap model) {
        model = creating(model);
        List<Article> articlesList = articleService.getAll();
        model.addAttribute("articlesList", articlesList);
        return "about_flowers";
    }


    @RequestMapping(value = "/add_product", method = RequestMethod.GET)
    public String getPage(ModelMap model) {
        model = creating(model);
        List<Product> myProducts = productService.getAllByUser_id(id);
        model.addAttribute("myProducts", myProducts);
        model.addAttribute("prodform", new ProductForm());
        return "add_product";
    }

    @RequestMapping(value = "/add_product", method = RequestMethod.POST)
    public String getProductAdding(ModelMap model, @ModelAttribute("prodform") @Valid ProductForm form, BindingResult result) {
        model = creating(model);

        Assert.notNull(form);
        Assert.notNull(form.getName());
        Assert.notNull(form.getType());
        Assert.notNull(form.getPrice());
        Assert.notNull(form.getDescr());

        if (result.hasErrors()) {
            return "add_product";
        }
        Product product = new Product();
        product.setUser(userService.getById(id));
        product.setName(form.getName());
        product.setType(form.getType());
        product.setPrice(form.getPrice());
        product.setDescr(form.getDescr());
        product.setDate(new SimpleDateFormat("dd-MM-yyyy hh:mm").format(new Date()));
        productService.save(product);
                   /*
     */
        return "redirect:/private_adv";
    }


    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public String contactsGet(ModelMap model) {
        model = creating(model);
        model.addAttribute("prodform", new RegistrationForm());
        return "contacts";
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.POST)
    public String getProductAdding(ModelMap model, @ModelAttribute("mesform") @Valid MessageForm messageForm, BindingResult result) {
        model = creating(model);
        if (result.hasErrors()) {
            return "contacts";
        }
        Message message = new Message();
        message.setUser(userService.getById(id));
        message.setTheme(messageForm.getTheme());
        message.setText(messageForm.getText());
        message.setDate(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
        messageService.save(message);
        return "redirect:/";
    }


    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String productsGet(ModelMap model, @CookieValue(value = "counter", defaultValue = "0") Long counter,
                              HttpServletResponse response) {
        model = creating(model);
        List<Flower> flowers = flowerService.getAll();
        counter++;

        Cookie cookie = new Cookie("counter", counter.toString());
        response.addCookie(cookie);
        System.out.println("Пользователь с логином " + login + " посетил страницу 'Цветы' " + counter + " раз(а).");
        model.put("flowers", flowers);
        return "products";
    }


    @RequestMapping(value = "/products/{category}", method = RequestMethod.GET)
    public String flowersShopPage(@PathVariable String category, ModelMap model) {
        List<Flower> flowers = flowerService.getAllByCategory(category);
        model = creating(model);
        model.put("flowers", flowers);
        return "products";
    }


    @RequestMapping(value = "/product_detail/{id}", method = RequestMethod.GET)
    public String productDetailGet(ModelMap model, @PathVariable("id") Integer id) {
        model = creating(model);
        Flower flower = flowerService.getById(id);
        model.addAttribute("flower", flower);
        return "product_detail";
    }

    @RequestMapping(value = "/shopping_cart", method = RequestMethod.GET)
    public String shoppingCartGet(ModelMap model) {
        model = creating(model);
        List<ShoppingCartItem> items = shoppingCartItemService.getAllByUser_Id(id);
        model.addAttribute("items", items);
        if (items.size() == 0) {
            model.addAttribute("empty", null);
        } else {
            Integer sum = 0;
            for (ShoppingCartItem shoppingCartItem : items) {
                sum += shoppingCartItem.getTotal();
            }
            model.addAttribute("sum", sum);
        }
        model.addAttribute("user", userService.getById(id));
        return "shopping_cart";
    }

    @RequestMapping(value = "/shopping_cart", method = RequestMethod.POST)
    public String shoppingCartDeliveryPost(ModelMap model) {
        model = creating(model);
//        return "shopping_cart";
        return "redirect:/delivery";
    }

    @RequestMapping(value = "/shopping_cart/{flower_id}", method = RequestMethod.POST)
    public String shoppingCartPost(@PathVariable Integer flower_id, @RequestParam(required = false) Integer quantity) { //(value = "quantity",
        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() != "anonymousUser") {
            User user = userService.getByLogin(login);
            Flower flower = flowerService.getById(flower_id);

            System.out.println(quantity + "****************************************");
            List<ShoppingCartItem> shoppingCartItems = shoppingCartItemService.getAllByUser_Id(id);
            for (int i = 0; shoppingCartItems.size() > i; i++) {
                System.out.println(shoppingCartItems.get(i).getFlower().getId());
                if (shoppingCartItems.get(i).getFlower().getId().equals(flower_id)) {
                    Integer newQuantity = 1 + shoppingCartItems.get(i).getQuantity();
                    shoppingCartItemService.updateQuantityAndTotal(newQuantity,
                            shoppingCartItems.get(i).getFlower().getPrice() * newQuantity,
                            userService.getById(id), flowerService.getById(flower_id));
                    return "redirect:/shopping_cart";
                }
            }

            ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
            shoppingCartItem.setUser(user);
            shoppingCartItem.setFlower(flower);
            if (quantity == null) {
                shoppingCartItem.setQuantity(1);
            } else {
                shoppingCartItem.setQuantity(quantity);
            }
            shoppingCartItem.setTotal(1 * shoppingCartItem.getFlower().getPrice());

            shoppingCartItemService.save(shoppingCartItem);

            return "redirect:/shopping_cart";

        } else {
            return "redirect:/login";
        }
    }


    @RequestMapping(value = "/faq", method = RequestMethod.GET)
    public String faqGet(ModelMap model) {
        model = creating(model);
        return "faq";
    }

    /*
        @RequestMapping(value = "/delivery", method = RequestMethod.POST)
        public String makeOrder(ModelMap model, @ModelAttribute("delform") @Valid DeliveryForm form) {
            model = creating(model);
         //   List<ShoppingCartItem> userBasket = shoppingCartItemService.getAllByUser_Id(id);


            deliveryService.saveDelivery(form);

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String date = dateFormat.format(new Date());
            deliveryService.getByUser_id(id).setDate(date);

         //   shoppingCartItemService.deleteByUserId(id);

            model.addAttribute("msg", "Заказ успешно оформлен. Администратор скоро свяжется с вами.");
            return "redirect:/success";
        }
    */
    @RequestMapping(value = "/delivery", method = RequestMethod.GET)
    public String getProcess(ModelMap model) {
        model = creating(model);

        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() != "anonymousUser") {
            if (!deliveryService.getAllByUser_id(id).isEmpty() && shoppingCartItemService.getAllByUser_Id(id).isEmpty()) {
                return "redirect:/success";
            } else {
                model.addAttribute("delform", new DeliveryForm());
                return "delivery";
            }
        } else {
            model.addAttribute("username", null);
            model.addAttribute("delform", new DeliveryForm());
            return "delivery";
        }

    }


    @RequestMapping(value = "/delivery", method = RequestMethod.POST)
    public String postProcess(ModelMap model, @ModelAttribute("delform") @Valid DeliveryForm form, BindingResult result) {
        model = creating(model);
        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() != "anonymousUser") {
            if (shoppingCartItemService.getAllByUser_Id(id).isEmpty()) {
//                result.addError(new FieldError("delform", "secondname", "Ошибка"));
                return "redirect:/products";
            }

            if (result.hasErrors()) {
                return "delivery";
            }

            List<Order> orders = new ArrayList<>();
            List<ShoppingCartItem> shoppingCartItems = shoppingCartItemService.getAllByUser_Id(id);

            for (int i = 0; i < shoppingCartItems.size(); i++) {
                Order order = new Order();
                orders.add(order);
                orders.get(i).setUser(shoppingCartItems.get(i).getUser());
                orders.get(i).setFlower(shoppingCartItems.get(i).getFlower());
                orders.get(i).setQuantity(shoppingCartItems.get(i).getQuantity());
                orders.get(i).setDate(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
                orders.add(orders.get(i));
                orderService.save(orders.get(i));
            }

            Delivery delivery = new Delivery();
            delivery.setUser(userService.getById(id));
            delivery.setSecondname(form.getSecondname());
            delivery.setName(form.getName());
            delivery.setLastname(form.getLastname());
            delivery.setCountry(form.getCountry());
            delivery.setCity(form.getCity());
            delivery.setStreet(form.getStreet());
            delivery.setHouse(form.getHouse());
            delivery.setFlat(form.getFlat());
            delivery.setPhone(form.getPhone());
            deliveryService.save(delivery);
            shoppingCartItemService.deleteByUser(userService.getById(id));
            return "redirect:/success";
        }
        return "delivery";
    }


    @RequestMapping(value = "/flower_description/{id}", method = RequestMethod.GET)
    public String flDescrGet(ModelMap model, @PathVariable("id") Integer id) {
        model = creating(model);
        Article article = articleService.getById(id);
        model.addAttribute("article", article);
        return "flower_description";
    }


    @RequestMapping(value = "/private_adv", method = RequestMethod.GET)
    public String privateAdvGet(ModelMap model) {
        model = creating(model);
        List<Product> products = productService.getAll();
        model.addAttribute("products", products);
        return "private_adv";
    }

    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public String successGet(ModelMap model) {
        model = creating(model);
        if (!deliveryService.getAllByUser_id(id).isEmpty()
                && shoppingCartItemService.getAllByUser_Id(id).isEmpty()) {
            model.addAttribute("msg", "Ваш заказ успешно оформлен. Ждите звонка!");
        }
        return "success";
    }


    @RequestMapping(value = "/item_delete/{id}", method = RequestMethod.POST)
    public String deleteFromBucket(ModelMap model, @PathVariable(value = "id") Integer id) {
        model = creating(model);
        shoppingCartItemService.deleteByFlower(flowerService.getById(id));
        return "redirect:/shopping_cart";
    }


    @RequestMapping(value = "/product_delete/{id}", method = RequestMethod.POST)
    public String deleteUserProduct(ModelMap model, @PathVariable(value = "id") Integer id) {
        model = creating(model);
        productService.deleteById(id);
        return "redirect:/add_product";
    }


    @RequestMapping(value = "/searchproducts", method = RequestMethod.GET, headers = "Accept=*/*")
    public
    @ResponseBody
    List<String> getProducts(@RequestParam("term") String query) {
        List<Flower> flowersList = flowerService.getAllByName(query);
        List<String> flowersName = new ArrayList<>();
        for (Flower aFlowersList : flowersList) {
            flowersName.add(aFlowersList.getName() + " " + aFlowersList.getType());
        }
        return flowersName;
    }


    @RequestMapping(value = "/searcharticles", method = RequestMethod.GET, headers = "Accept=*/*")
    public
    @ResponseBody
    List<String> getArticles(@RequestParam("term") String query) {
        List<Article> articleList = articleService.getAllByName(query);
        List<String> articlessName = new ArrayList<>();
        for (Article aFlowersList : articleList) {
            articlessName.add(aFlowersList.getName());
        }
        return articlessName;
    }


}
