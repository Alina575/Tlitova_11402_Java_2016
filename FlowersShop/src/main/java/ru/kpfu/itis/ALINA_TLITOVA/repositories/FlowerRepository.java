package ru.kpfu.itis.ALINA_TLITOVA.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ru.kpfu.itis.ALINA_TLITOVA.models.Flower;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface FlowerRepository extends JpaRepository<Flower, Long> {

    List<Flower> findAll();

    List<Flower> findByNameContainingIgnoreCase(String name);

    Flower findByName(String name);

    Flower findById(Integer id);

    List<Flower> findAllByCategory(String category);

}
