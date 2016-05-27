package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import javafx.event.ActionEvent;

import java.io.IOException;

/**
 * @author Alina Tlitova
 *         11-402
 */

public abstract class MainController extends AbstractController{

    public void handleProducts(ActionEvent actionEvent) throws IOException {
        app.redirect("products");

    }

    public void handleOrders(ActionEvent actionEvent) throws IOException {
        app.redirect("orders");

    }

    public void handleArticles(ActionEvent actionEvent) throws IOException {
        app.redirect("articles");

    }
}
