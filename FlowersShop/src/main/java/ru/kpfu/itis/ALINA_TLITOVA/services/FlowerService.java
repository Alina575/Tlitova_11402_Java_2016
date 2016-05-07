package ru.kpfu.itis.ALINA_TLITOVA.services;

import org.springframework.data.domain.Page;
import ru.kpfu.itis.ALINA_TLITOVA.models.Flower;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface FlowerService {

    List<Flower> getAll();

    Flower getById(Integer id);

    Flower getByName(String login);

    Flower save(Flower flower);

    Page<Flower> getByCategory(String category, Integer page);

    List<Flower> search(String name);

}
