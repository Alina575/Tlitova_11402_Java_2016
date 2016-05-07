package ru.kpfu.itis.ALINA_TLITOVA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.ALINA_TLITOVA.models.Article;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface ArticleRepository extends JpaRepository<Article, Long> {

    Article findByName(String name);

    Article findById(Integer id);

}
