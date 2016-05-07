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
import ru.kpfu.itis.ALINA_TLITOVA.models.Delivery;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.DeliveryRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.DeliveryService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/web/WEB-INF/root-config.xml"})
public class DeliveryServiceTest {

    @Mock
    private DeliveryRepository deliveryRepository;

    @InjectMocks
    @Autowired
    DeliveryService deliveryService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetById() {
        when(deliveryRepository.findOne(anyInt())).thenReturn(deliveryCreating());
        Delivery delivery = deliveryService.getById(1);
        Assert.assertEquals(delivery.getId().longValue(), 1);
    }

    @Test
    public void testGetByUser_id() {
        when(deliveryRepository.findByUser_id(anyInt())).thenReturn(deliveryCreating());
        Delivery delivery = deliveryService.getByUser_id(1);
        Assert.assertEquals(delivery.getName(), "Ann");
    }

    @Test
    public void testFindAll() {
        List<Delivery> deliveries = new ArrayList<>();
        Delivery delivery = deliveryCreating();
        for (int i = 0; i < 1; i++) {
            deliveries.add(delivery);
        }
        when(deliveryRepository.findAll()).thenReturn(deliveries);
        List<Delivery> deliveries1 = deliveryService.getAll();
        Assert.assertEquals(deliveries.contains(delivery), deliveries1.contains(delivery));
    }

    @Test
    public void testSave() {
        Delivery delivery = deliveryCreating();
        when(deliveryRepository.save(delivery)).thenReturn(deliveryCreating());
        Delivery delivery1 = deliveryService.save(delivery);
        Assert.assertEquals(delivery.getId(), delivery1.getId());
        Assert.assertEquals(delivery.getLastname(), delivery1.getLastname());
        Assert.assertEquals(delivery.getName(), delivery1.getName());
        Assert.assertEquals(delivery.getSecondname(), delivery1.getSecondname());
        Assert.assertEquals(delivery.getCountry(), delivery1.getCountry());
        Assert.assertEquals(delivery.getCity(), delivery1.getCity());
        Assert.assertEquals(delivery.getStreet(), delivery1.getStreet());
        Assert.assertEquals(delivery.getHouse(), delivery1.getHouse());
        Assert.assertEquals(delivery.getFlat(), delivery1.getFlat());
        Assert.assertEquals(delivery.getPhone(), delivery1.getPhone());
    }

    private Delivery deliveryCreating() {
        Delivery delivery = new Delivery();
        delivery.setId(1);
        delivery.setLastname("An");
        delivery.setName("Ann");
        delivery.setSecondname("A");
        delivery.setCountry("Russia");
        delivery.setCity("Kazan");
        delivery.setStreet("Saharova");
        delivery.setHouse("2");
        delivery.setFlat("3");
        delivery.setPhone("89098981212");
        return delivery;
    }

}
