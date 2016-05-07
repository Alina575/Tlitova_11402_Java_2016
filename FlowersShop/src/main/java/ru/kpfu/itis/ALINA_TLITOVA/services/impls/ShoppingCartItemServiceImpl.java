package ru.kpfu.itis.ALINA_TLITOVA.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.ALINA_TLITOVA.models.ShoppingCartItem;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.ShoppingCartItemRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.ShoppingCartItemService;

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
}
