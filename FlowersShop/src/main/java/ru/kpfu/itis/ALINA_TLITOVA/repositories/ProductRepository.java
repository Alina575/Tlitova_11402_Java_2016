package ru.kpfu.itis.ALINA_TLITOVA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.ALINA_TLITOVA.models.Product;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findById(Integer id);

    Product findByUserId(Integer user_id);

    List<Product> findAll();
}
