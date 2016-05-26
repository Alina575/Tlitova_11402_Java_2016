package ru.kpfu.itis.ALINA_TLITOVA.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.ALINA_TLITOVA.models.Flower;
import ru.kpfu.itis.ALINA_TLITOVA.models.ShoppingCartItem;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.ShoppingCartItemRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.ShoppingCartItemService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Service
public class ShoppingCartItemServiceImpl implements ShoppingCartItemService {
    @Autowired
    ShoppingCartItemRepository shoppingCartItemRepository;

    @Override
    public List<ShoppingCartItem> getAll() {
        return shoppingCartItemRepository.findAll();
    }

    @Override
    public List<ShoppingCartItem> getAllByUser_Id(Integer user_id) {
        return shoppingCartItemRepository.findAllByUser_id(user_id);
    }

    @Override
    public ShoppingCartItem getById(Integer id) {
        return shoppingCartItemRepository.findById(id);
    }

    @Override
    public ShoppingCartItem getByUser_id(Integer user_id) {
        return shoppingCartItemRepository.findByUser_id(user_id);
    }

    @Override
    public void deleteById(Integer id) {
        shoppingCartItemRepository.delete(id.longValue());
    }

    @Override
    public void delete(ShoppingCartItem shoppingCartItem) {
        shoppingCartItemRepository.delete(shoppingCartItem);
    }

    @Override
    public ShoppingCartItem save(ShoppingCartItem shoppingCartItem) {
        return shoppingCartItemRepository.save(shoppingCartItem);
    }

    @Override
    public void updateQuantityAndTotal(Integer quantity, Integer total, User user, Flower flower) {
        shoppingCartItemRepository.setQuantityAndTotal(quantity, total, user, flower);
    }

    @Override
    public void deleteByUser(User user) {
        shoppingCartItemRepository.deleteByUser(user);
    }

    @Override
    public void deleteByFlower(Flower flower) {
        shoppingCartItemRepository.deleteByFlower(flower);
    }
}
