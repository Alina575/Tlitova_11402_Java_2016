package ru.kpfu.itis.ALINA_TLITOVA.javafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.net.URL;

/**
 * @author Alina Tlitova
 *         11-402
 */

public class Loader {
    @Autowired
    private AnnotationConfigApplicationContext applicationContext;

    private Scene scene;

    public Loader() {
        scene = new Scene(new Pane());
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public <T> T load(URL url) {
        try {
            FXMLLoader loader = new FXMLLoader(url);
            loader.setControllerFactory(applicationContext::getBean);
            return loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void redirect(String pageName) {
        scene.setRoot(load(getClass().getResource("fxmls/" + pageName + ".fxml")));
    }

}
