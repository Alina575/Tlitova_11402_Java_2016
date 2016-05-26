package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.document.AbstractPdfView;
import ru.kpfu.itis.ALINA_TLITOVA.models.*;
import ru.kpfu.itis.ALINA_TLITOVA.services.DeliveryService;
import ru.kpfu.itis.ALINA_TLITOVA.services.OrderService;
import ru.kpfu.itis.ALINA_TLITOVA.services.ShoppingCartItemService;
import ru.kpfu.itis.ALINA_TLITOVA.services.UserService;

import java.math.BigInteger;
import java.util.*;

/**
 * @author Alina Tlitova
 *         11-402
 *         07.05.2016
 */

@Controller
public class PDFController {

    @Autowired
    OrderService orderService;

    @Autowired
    DeliveryService deliveryService;

    @Autowired
    UserService userService;

    @Autowired
    ShoppingCartItemService shoppingCartItemService;

    @RequestMapping(value = "/deliveryDetails.htm", method = RequestMethod.GET)
    ModelAndView generatePdf() throws Exception {
        ModelAndView modelAndView = new ModelAndView("pdfView");
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Integer size = orderService.getAllByUser_Id(user.getId()).size();

        modelAndView.addObject("login", user.getLogin());
        modelAndView.addObject("phone", user.getPhone());
        modelAndView.addObject("date", orderService.getAllByUser_Id(user.getId()).get(size - 1).getDate());

        List<Order> ordersList = orderService.getAllByUser_Id(user.getId());
        modelAndView.addObject("ordersList",ordersList);

        return modelAndView;
    }
}

