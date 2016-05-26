package ru.kpfu.itis.ALINA_TLITOVA.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import ru.kpfu.itis.ALINA_TLITOVA.models.Article;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.ArticleRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.ArticleService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/web/WEB-INF/root-config.xml"})
public class ArticleServiceTest {

    @Mock
    private ArticleRepository articleRepository;

    @InjectMocks
    @Autowired
    ArticleService articleService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetById() {
        when(articleRepository.findOne(anyLong())).thenReturn(articleCreating());
        Article article = articleService.getById(1);
        Assert.assertEquals(article.getId().longValue(), 1);
    }

    @Test
    public void testGetByName() {
        when(articleRepository.findByName(anyString())).thenReturn(articleCreating());
        Article article = articleService.getByName("New");
        Assert.assertEquals(article.getName(), "New");
    }

    @Test
    public void testSave() {
        Article article = articleCreating();
        when(articleRepository.save(article)).thenReturn(articleCreating());
        Article article1 = articleService.save(article);
        Assert.assertEquals(article.getId(), article1.getId());
        Assert.assertEquals(article.getName(), article.getName());
        Assert.assertEquals(article.getIntro(), article.getIntro());
        Assert.assertEquals(article.getText(), article.getText());
    }

    @Test
    public void testFindAll() {
        List<Article> articles = new ArrayList<>();
        Article article = articleCreating();
        for (int i = 0; i < 1; i++) {
            articles.add(article);
        }
        when(articleRepository.findAll()).thenReturn(articles);
        List<Article> articles1 = articleService.getAll();
        Assert.assertEquals(articles.contains(article), articles1.contains(article));
    }


    private Article articleCreating() {
        Article article = new Article();
        article.setId(1);
        article.setName("New");
        article.setIntro("Aaa");
        article.setText("Bbb");
        return article;
    }
}
