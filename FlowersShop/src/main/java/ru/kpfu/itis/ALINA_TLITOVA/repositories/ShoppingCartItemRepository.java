package ru.kpfu.itis.ALINA_TLITOVA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.ALINA_TLITOVA.models.Flower;
import ru.kpfu.itis.ALINA_TLITOVA.models.ShoppingCartItem;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

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

    @Transactional
    @Modifying
    @Query("delete from ShoppingCartItem s where s.flower = ?1")
    void deleteByFlower(Flower flower);

    @Transactional
    @Modifying
    @Query("update ShoppingCartItem s set s.quantity = ?1, s.total=?2 where s.user = ?3 and s.flower = ?4")
    void setQuantityAndTotal(Integer quantity, Integer total, User user, Flower flower);

    @Transactional
    @Modifying
    @Query("delete from ShoppingCartItem s where s.user = ?1")
    void deleteByUser(User user);
}
