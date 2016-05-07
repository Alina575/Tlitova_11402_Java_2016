package ru.kpfu.itis.ALINA_TLITOVA.services;

import ru.kpfu.itis.ALINA_TLITOVA.models.ShoppingCartItem;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface ShoppingCartItemService {

    List<ShoppingCartItem> getAll();

    ShoppingCartItem getById(Integer id);

    ShoppingCartItem getByUser_id(Integer id);

    void deleteById(Integer id);

    void delete(ShoppingCartItem shoppingCartItem);

    ShoppingCartItem save(ShoppingCartItem shoppingCartItem);
}
