package ru.kpfu.itis.ALINA_TLITOVA;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.kpfu.itis.ALINA_TLITOVA.connection.Connection;
import ru.kpfu.itis.ALINA_TLITOVA.controllers.AbstractController;

import java.io.IOException;

/**
 * @author Alina Tlitova
 *         11-402
 */

public class Main extends Application {
    public Stage s;
    private String serverURL = "http://localhost:8080/api/";

    @Override
    public void start(Stage primaryStage) throws Exception {

        s = primaryStage;
        redirect("login");
    }

    public void redirect(String place) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxmls/" + place + ".fxml"));
        Parent root = loader.load();

        AbstractController controller = loader.getController();
        controller.setApp(this);

        s.setScene(new Scene(root));
        s.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}