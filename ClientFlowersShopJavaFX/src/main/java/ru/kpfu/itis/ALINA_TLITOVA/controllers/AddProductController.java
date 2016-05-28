package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import ru.kpfu.itis.ALINA_TLITOVA.connection.Connection;
import ru.kpfu.itis.ALINA_TLITOVA.javafx.Loader;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Configurable
public class AddProductController extends AbstractController {
    User user;

    @Autowired
    public Loader loader;

    @Autowired
    public Connection connection;

    @FXML
    TextField name;

    @FXML
    TextField type;

    @FXML
    TextField price;

    @FXML
    TextField description;

    @FXML
    TextField number;

    @FXML
    Label errorField;

    public void add_new_product(ActionEvent actionEvent) throws IOException {
        if (name.getText() == null || type.getText() == null || price.getText() == null ||
                description.getText() == null || number.getText() == null) {
            errorField.setText("All fields should be fulled");
        } else {
            connection.addProduct(user, name.getText(), type.getText(), price.getText(),
                    description.getText(), number.getText(), new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
            loader.redirect("products");
        }
    }
}
