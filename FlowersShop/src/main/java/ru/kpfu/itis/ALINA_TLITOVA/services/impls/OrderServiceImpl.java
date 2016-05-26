package ru.kpfu.itis.ALINA_TLITOVA.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.ALINA_TLITOVA.models.Order;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.OrderRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.OrderService;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public List<Order> getAllByUser_Id(Integer user_id) {
        return orderRepository.findAllByUser_id(user_id);
    }

    @Override
    public Order getById(Integer id) {
        return orderRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        orderRepository.delete(id.longValue());
    }

    @Override
    public void delete(Order order) {
        orderRepository.delete(order);
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void deleteByUser(User user) {
        orderRepository.deleteByUser(user);
    }
}
