package ru.kpfu.itis.ALINA_TLITOVA.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.kpfu.itis.ALINA_TLITOVA.connection.Connection;
import ru.kpfu.itis.ALINA_TLITOVA.controllers.*;
import ru.kpfu.itis.ALINA_TLITOVA.javafx.Loader;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Configuration
public class BeanConfiguration {

    @Bean
    LoginController loginController() {
        return new LoginController();
    }

    @Bean
    AddProductController addProductController() {
        return new AddProductController();
    }

    @Bean
    ArticlesController articlesController() {
        return new ArticlesController();
    }

    @Bean
    OrdersController ordersController(){
        return new OrdersController();
    }

    @Bean
    ProductsController productsController(){
        return new ProductsController();
    }

    @Bean
    MessagesController messagesController(){
        return new MessagesController();
    }

    @Bean
    AddMessageController addMessageController(){
        return new AddMessageController();
    }

    @Bean
    Loader Loader() {
        return new Loader();
    }

    @Bean
    Connection serverApi() {
        return new Connection();
    }
}
