package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import ru.kpfu.itis.ALINA_TLITOVA.connection.Connection;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;
import ru.kpfu.itis.ALINA_TLITOVA.javafx.Loader;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Configurable
public class LoginController {

    @Autowired
    public Loader loader;

    @Autowired
    public Connection connection;

    @FXML
    TextField loginTextField;

    @FXML
    TextField passwordField;

    @FXML
    Label errorField;

    public void login(ActionEvent actionEvent) {
        User user = connection.auth(loginTextField.getText(), passwordField.getText());
        if (user != null) {
            loader.redirect("products");
        } else {
            errorField.setText("Incorrect login or password!");
        }
    }
}
