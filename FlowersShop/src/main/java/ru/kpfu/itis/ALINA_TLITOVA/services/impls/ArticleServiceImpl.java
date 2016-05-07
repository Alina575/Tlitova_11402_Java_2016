package ru.kpfu.itis.ALINA_TLITOVA.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.ALINA_TLITOVA.models.Article;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.ArticleRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.ArticleService;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleRepository articleRepository;

    @Override
    public List<Article> getAll() {
        return articleRepository.findAll();
    }

    @Override
    public Article getById(Integer id) {
        return articleRepository.findById(id);
    }

    @Override
    public Article getByName(String name) {
        return articleRepository.findByName(name);
    }

    @Override
    public void delete(Article article) {
        articleRepository.delete(article);
    }

    @Override
    public void deleteById(Integer id) {
        articleRepository.delete(Long.valueOf(id));
    }

    @Override
    public Article save(Article article) {
        return articleRepository.save(article);
    }


}
