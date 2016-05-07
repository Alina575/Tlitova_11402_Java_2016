package ru.kpfu.itis.ALINA_TLITOVA.services;

import ru.kpfu.itis.ALINA_TLITOVA.models.Article;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface ArticleService {

    List<Article> getAll();

    Article getById(Integer id);

    Article getByName(String login);

    void delete(Article article);

    void deleteById(Integer id);

    Article save(Article article);
}
