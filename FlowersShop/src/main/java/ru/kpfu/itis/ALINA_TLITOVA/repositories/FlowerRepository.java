package ru.kpfu.itis.ALINA_TLITOVA.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.ALINA_TLITOVA.models.Flower;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface FlowerRepository extends JpaRepository<Flower, Long> {

    List<Flower> findAll();

    Page<Flower> findByCategory(String category, Pageable page);

    List<Flower> findByNameContainingIgnoreCase(String name);

    Flower findByName(String name);

    Flower findById(Integer id);
}
