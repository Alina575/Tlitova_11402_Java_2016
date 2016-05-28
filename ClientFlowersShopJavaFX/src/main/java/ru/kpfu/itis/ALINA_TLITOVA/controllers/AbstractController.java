package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import javafx.event.ActionEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import ru.kpfu.itis.ALINA_TLITOVA.App;
import ru.kpfu.itis.ALINA_TLITOVA.connection.Connection;
import ru.kpfu.itis.ALINA_TLITOVA.javafx.Loader;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Configurable
public abstract class AbstractController {

    @Autowired
    public Loader loader;

    @Autowired
    public Connection connection;

    public void orders(ActionEvent actionEvent) {
        loader.redirect("orders");
    }

    public void articles(ActionEvent actionEvent) {
        loader.redirect("articles");
    }

    public void products(ActionEvent actionEvent) {
        loader.redirect("products");
    }

    public void messages(ActionEvent actionEvent) {
        loader.redirect("messages");
    }

    public void add_product(ActionEvent actionEvent) {
        loader.redirect("add_product");
    }

   public void add_message(ActionEvent actionEvent) {
        loader.redirect("add_message");
    }

    public void logout() {
        connection.logout();
        loader.redirect("login");
    }
}
