package ru.kpfu.itis.ALINA_TLITOVA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.ALINA_TLITOVA.models.ShoppingCartItem;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface ShoppingCartItemRepository extends JpaRepository<ShoppingCartItem, Long> {

    List<ShoppingCartItem> findAll();

    List<ShoppingCartItem> findAllByUser_id(Integer user_id);

    ShoppingCartItem findById(Integer id);

    ShoppingCartItem findByUser_id(Integer user_id);

}
