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
import ru.kpfu.itis.ALINA_TLITOVA.models.Flower;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.FlowerRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.FlowerService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/web/WEB-INF/root-config.xml"})
public class FlowerServiceTest {

    @Mock
    private FlowerRepository flowerRepository;

    @InjectMocks
    @Autowired
    FlowerService flowerService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetById() {
        when(flowerRepository.findOne(anyLong())).thenReturn(flowerCreating());
        Flower flower = flowerService.getById(1);
        Assert.assertEquals(flower.getId().longValue(), 1);
    }

    @Test
    public void testGetByName() {
        when(flowerRepository.findByName(anyString())).thenReturn(flowerCreating());
        Flower flower = flowerService.getByName("Rose");
        Assert.assertEquals(flower.getName(), "Rose");
    }

    @Test
    public void testSave() {
        Flower flower = flowerCreating();
        when(flowerRepository.save(flower)).thenReturn(flowerCreating());
        Flower flower1 = flowerService.save(flower);
        Assert.assertEquals(flower.getId(), flower1.getId());
        Assert.assertEquals(flower.getName(), flower1.getName());
        Assert.assertEquals(flower.getDescr(), flower1.getDescr());
        Assert.assertEquals(flower.getPrice(), flower1.getPrice());
        Assert.assertEquals(flower.getQuantity(), flower1.getQuantity());
    }

    @Test
    public void testSearch() {
        List<Flower> flowers = new ArrayList<>();
        Flower flower = flowerCreating();
        for (int i = 0; i < 2; i++) {
            flowers.add(flower);
        }
        when(flowerRepository.findByNameContainingIgnoreCase("Rose")).thenReturn(flowers);
        List<Flower> flowers1 = flowerService.search("Rose");
        Assert.assertEquals(flowers.contains(flower), flowers1.contains(flower));
    }

   @Test
    public void testFindAll() {
        List<Flower> flowers = new ArrayList<>();
        Flower flower = flowerCreating();
        for (int i = 0; i < 2; i++) {
            flowers.add(flower);
        }
        when(flowerRepository.findAll()).thenReturn(flowers);
        List<Flower> flowers1 = flowerService.getAll();
        Assert.assertEquals(flowers.contains(flower), flowers1.contains(flower));
    }

    private Flower flowerCreating() {
        Flower flower = new Flower();
        flower.setId(1);
        flower.setName("Rose");
        flower.setDescr("aaa");
        flower.setPrice(100);
        flower.setQuantity(1);
        return flower;
    }

}
