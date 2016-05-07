package ru.kpfu.itis.ALINA_TLITOVA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.ALINA_TLITOVA.models.Sale;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface SaleRepository extends JpaRepository<Sale, Long> {

    Sale findById(Integer id);

    List<Sale> findAll();
}
