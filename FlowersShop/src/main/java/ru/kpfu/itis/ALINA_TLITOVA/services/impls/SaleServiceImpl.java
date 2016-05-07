package ru.kpfu.itis.ALINA_TLITOVA.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.ALINA_TLITOVA.models.Sale;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.SaleRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.SaleService;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    SaleRepository saleRepository;

    @Override
    public List<Sale> getAll() {
        return saleRepository.findAll();
    }

    @Override
    public Sale getById(Integer id) {
        return saleRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        saleRepository.delete(id.longValue());
    }

    @Override
    public Sale add(Sale sale) {
        return saleRepository.save(sale);
    }


}
