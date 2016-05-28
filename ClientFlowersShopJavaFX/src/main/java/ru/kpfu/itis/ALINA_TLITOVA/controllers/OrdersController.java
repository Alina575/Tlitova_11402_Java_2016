package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import org.springframework.beans.factory.annotation.Configurable;
import ru.kpfu.itis.ALINA_TLITOVA.models.Order;
import ru.kpfu.itis.ALINA_TLITOVA.models.Product;

import java.io.IOException;
import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Configurable
public class OrdersController extends AbstractController {

    @FXML
    TableColumn userId;

    @FXML
    TableColumn flowerId;

    @FXML
    TableColumn quantity;

    @FXML
    TableColumn date;

    public void getProducts() throws IOException {
        loader.redirect("orders");
        List<Order> orders = connection.getOrders();

        for (Order order : orders) {
            userId.setText(order.getUser().getId().toString());
            flowerId.setText(order.getFlower().getId().toString());
            quantity.setText(order.getQuantity().toString());
            date.setText(order.getDate());
        }
    }
}
