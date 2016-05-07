package ru.kpfu.itis.ALINA_TLITOVA.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.ALINA_TLITOVA.models.Flower;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.FlowerRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.FlowerService;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Service
public class FlowerServiceImpl implements FlowerService {

    @Autowired
    FlowerRepository flowerRepository;

    @Override
    public List<Flower> getAll() {
        return flowerRepository.findAll();
    }

    @Override
    public Flower getById(Integer id) {
        return flowerRepository.findById(id);
    }

    @Override
    public Flower getByName(String name) {
        return flowerRepository.findByName(name);
    }

    @Override
    public Flower save(Flower flower) {
        return flowerRepository.save(flower);
    }

    @Override
    public Page<Flower> getByCategory(String category, Integer page) {
        if(page == null) page = 0;
        int pageSize = 12;
        return flowerRepository.findByCategory(category, new PageRequest(page, pageSize));
    }

    @Override
    public List<Flower> search(String name) {
        return flowerRepository.findByNameContainingIgnoreCase(name);
    }


}
