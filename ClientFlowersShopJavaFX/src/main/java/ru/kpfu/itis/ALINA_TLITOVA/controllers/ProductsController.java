package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import ru.kpfu.itis.ALINA_TLITOVA.connection.Connection;
import ru.kpfu.itis.ALINA_TLITOVA.javafx.Loader;
import ru.kpfu.itis.ALINA_TLITOVA.models.Product;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

import java.io.IOException;
import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Configurable
public class ProductsController extends AbstractController {

    @FXML
    TableColumn name;
    @FXML
    TableColumn type;
    @FXML
    TableColumn price;
    @FXML
    TableColumn date;
    @FXML
    TableColumn userLogin;
    @FXML
    TableColumn description;
    @FXML
    TableColumn number;

    public void getProducts() throws IOException {
        loader.redirect("products");
        List<Product> products = connection.getProducts();

        for (Product product : products) {
                name.setText(product.getName());
                type.setText(product.getType());
                price.setText(product.getPrice().toString());
                date.setText(product.getDate());
                userLogin.setText(product.getUser().getLogin());
                description.setText(product.getDescr());
                number.setText(product.getNumber());
            }

    }
}
