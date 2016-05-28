package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import org.springframework.beans.factory.annotation.Configurable;
import ru.kpfu.itis.ALINA_TLITOVA.models.Article;
import ru.kpfu.itis.ALINA_TLITOVA.models.Message;

import java.io.IOException;
import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Configurable
public class MessagesController extends AbstractController {

    @FXML
    TableColumn userId;

    @FXML
    TableColumn theme;

    @FXML
    TableColumn text;

    @FXML
    TableColumn date;

    public void getMessages() throws IOException {
        loader.redirect("messages");
        List<Message> messages = connection.getMessages();

        for (Message message : messages) {
            userId.setText(message.getUser().getId().toString());
            theme.setText(message.getText());
            text.setText(message.getText());
            date.setText(message.getDate());
        }

    }
}
