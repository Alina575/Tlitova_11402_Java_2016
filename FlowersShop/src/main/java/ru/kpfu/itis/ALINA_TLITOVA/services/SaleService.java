package ru.kpfu.itis.ALINA_TLITOVA.services;

import ru.kpfu.itis.ALINA_TLITOVA.models.Sale;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 *         03.05.2016
 */

public interface SaleService {

    List<Sale> getAll();

    Sale getById(Integer id);

    void deleteById(Integer id);

    Sale add(Sale sale);

}
