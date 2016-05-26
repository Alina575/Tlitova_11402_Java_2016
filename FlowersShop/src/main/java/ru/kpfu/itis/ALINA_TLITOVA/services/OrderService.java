package ru.kpfu.itis.ALINA_TLITOVA.services;

import ru.kpfu.itis.ALINA_TLITOVA.models.Flower;
import ru.kpfu.itis.ALINA_TLITOVA.models.Order;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface OrderService {

    List<Order> getAll();

    List<Order> getAllByUser_Id(Integer user_id);

    Order getById(Integer id);

    void deleteById(Integer id);

    void delete(Order order);

    Order save(Order order);

    void deleteByUser(User user);
}
