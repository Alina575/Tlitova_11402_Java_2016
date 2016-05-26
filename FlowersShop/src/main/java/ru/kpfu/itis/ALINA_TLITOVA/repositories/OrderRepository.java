package ru.kpfu.itis.ALINA_TLITOVA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.ALINA_TLITOVA.models.Flower;
import ru.kpfu.itis.ALINA_TLITOVA.models.Order;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 *         22.05.2016
 */

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAll();

    List<Order> findAllByUser_id(Integer user_id);

    Order findById(Integer id);

    @Transactional
    @Modifying
    @Query("delete from Order s where s.user = ?1")
    void deleteByUser(User user);
}
