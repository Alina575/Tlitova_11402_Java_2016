package ru.kpfu.itis.ALINA_TLITOVA;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.kpfu.itis.ALINA_TLITOVA.configuration.BeanConfiguration;
import ru.kpfu.itis.ALINA_TLITOVA.javafx.Loader;

/**
 * @author Alina Tlitova
 *         11-402
 */

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Loader loader = context.getBean(Loader.class);
        loader.redirect("login");
        primaryStage.setScene(loader.getScene());
        primaryStage.show();
    }
}
