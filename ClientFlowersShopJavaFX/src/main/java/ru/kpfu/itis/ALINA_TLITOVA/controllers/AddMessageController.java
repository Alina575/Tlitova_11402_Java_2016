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
public class AddMessageController extends AbstractController {
    User user;

    @Autowired
    public Loader loader;

    @Autowired
    public Connection connection;

    @FXML
    TextField theme;

    @FXML
    TextField text;

    @FXML
    Label errorField;

    public void add_new_message(ActionEvent actionEvent) throws IOException {
        if (theme.getText() == null || text.getText() == null) {
            errorField.setText("All fields should be fulled");
        } else {
            connection.addMessage(user, theme.getText(), text.getText(), new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
            loader.redirect("products");
        }
    }
}
