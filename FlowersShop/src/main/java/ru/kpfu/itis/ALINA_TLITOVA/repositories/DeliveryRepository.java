package ru.kpfu.itis.ALINA_TLITOVA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.ALINA_TLITOVA.models.Delivery;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {

        List<Delivery> findAll();

        Delivery findById(Integer id);

        Delivery findByUser_id(Integer user_id);

        Delivery findByUser_login(String user_login);

        List<Delivery> findAllByUser_id(Integer id);
}
