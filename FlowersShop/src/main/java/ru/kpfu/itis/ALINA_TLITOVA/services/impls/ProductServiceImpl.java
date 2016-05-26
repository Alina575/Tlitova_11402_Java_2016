package ru.kpfu.itis.ALINA_TLITOVA.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.ALINA_TLITOVA.forms.ProductForm;
import ru.kpfu.itis.ALINA_TLITOVA.models.Product;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.ProductRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.ProductService;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void saveProduct(ProductForm productForm) {
        if (productForm != null) {
            Product product = new Product();
            product.setName(productForm.getName());
            product.setType(productForm.getType());
            product.setDescr(productForm.getDescr());
            product.setPrice(productForm.getPrice());
            productRepository.save(product);
        }
    }

    @Override
    public void deleteByUser(User user) {
        productRepository.deleteByUser(user);
    }

    @Override
    public List<Product> getAllByUser_id(Integer user_id) {
        return productRepository.findAllByUser_id(user_id);
    }
}
