package ru.kpfu.itis.ALINA_TLITOVA.services;

import ru.kpfu.itis.ALINA_TLITOVA.models.Flower;
import ru.kpfu.itis.ALINA_TLITOVA.models.ShoppingCartItem;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface ShoppingCartItemService {

    List<ShoppingCartItem> getAll();

    List<ShoppingCartItem> getAllByUser_Id(Integer user_id);

    ShoppingCartItem getById(Integer id);

    ShoppingCartItem getByUser_id(Integer id);

    void deleteById(Integer id);

    void delete(ShoppingCartItem shoppingCartItem);

    ShoppingCartItem save(ShoppingCartItem shoppingCartItem);

    void updateQuantityAndTotal(Integer quantity, Integer total, User user, Flower flower);

    void deleteByUser(User user);

    void deleteByFlower(Flower flower);
}
