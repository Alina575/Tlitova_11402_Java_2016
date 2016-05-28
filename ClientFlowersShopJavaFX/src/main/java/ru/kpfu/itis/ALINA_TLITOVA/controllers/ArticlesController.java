package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import org.springframework.beans.factory.annotation.Configurable;
import ru.kpfu.itis.ALINA_TLITOVA.models.Article;
import ru.kpfu.itis.ALINA_TLITOVA.models.Product;

import java.io.IOException;
import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Configurable
public class ArticlesController extends AbstractController {

    @FXML
    TableColumn name;
    @FXML
    TableColumn introduction;
    @FXML
    TableColumn text;

    public void getArticles() throws IOException {
        loader.redirect("articles");
        List<Article> articles = connection.getArticles();

        for (Article article : articles) {
            name.setText(article.getName());
            introduction.setText(article.getIntro());
            text.setText(article.getText());
        }

    }
}
