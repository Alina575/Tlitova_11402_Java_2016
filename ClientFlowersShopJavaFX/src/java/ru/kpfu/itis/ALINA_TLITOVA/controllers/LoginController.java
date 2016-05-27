package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Configurable;
import ru.kpfu.itis.ALINA_TLITOVA.Main;
import ru.kpfu.itis.ALINA_TLITOVA.connection.Connection;

import javax.security.sasl.AuthenticationException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Configurable
public class LoginController extends AbstractController {
    @FXML
    public TextField loginTextField;
    @FXML
    public PasswordField passwordField;
    @FXML
    public Label errorField;

    public Main main;

    @FXML
    private void login(ActionEvent actionEvent) throws Exception {
        Connection connection = new Connection();
        connection.auth(loginTextField.getText(), passwordField.getText());
        if (connection.getRole() != null) {
            if (connection.getRole().toString().equals("ROLE_BUYER")) {
                main.redirect("add_product");
            } else {
                main.redirect("products");

            }
        } else {
            errorField.setText("Incorrect login or password!");
        }
    }
}
