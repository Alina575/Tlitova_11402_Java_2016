package ru.kpfu.itis.ALINA_TLITOVA.services;

import org.springframework.data.domain.Page;
import ru.kpfu.itis.ALINA_TLITOVA.forms.ProductForm;
import ru.kpfu.itis.ALINA_TLITOVA.models.Flower;
import ru.kpfu.itis.ALINA_TLITOVA.models.Product;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface ProductService {

    List<Product> getAll();

    Product getById(Integer id);

    void deleteById(Integer id);

    Product save(Product product);

    void saveProduct(ProductForm productForm);

    void deleteByUser(User user);

    List<Product> getAllByUser_id(Integer user_id);
}
