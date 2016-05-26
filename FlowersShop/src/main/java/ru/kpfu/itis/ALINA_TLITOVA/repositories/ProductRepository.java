package ru.kpfu.itis.ALINA_TLITOVA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.ALINA_TLITOVA.models.Product;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findById(Integer id);

    Product findByUserId(Integer user_id);

    List<Product> findAll();

    List<Product> findAllByUser_id(Integer user_id);

    @Transactional
    @Modifying
    @Query("delete from Product p where p.user = ?1")
    void deleteByUser(User user);

    @Transactional
    @Modifying
    @Query("delete from Product p where p.id = ?1")
    void deleteById(Integer id);
}
