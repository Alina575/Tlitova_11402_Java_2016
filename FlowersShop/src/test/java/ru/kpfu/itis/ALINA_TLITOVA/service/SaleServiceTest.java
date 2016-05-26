package java.ru.kpfu.itis.ALINA_TLITOVA.service;
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
import ru.kpfu.itis.ALINA_TLITOVA.models.Message;
import ru.kpfu.itis.ALINA_TLITOVA.models.Sale;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.SaleRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.SaleService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/root-config.xml"})
public class SaleServiceTest {

    @Mock
    private SaleRepository saleRepository;

    @InjectMocks
    @Autowired
    SaleService saleService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetById() {
        when(saleRepository.findOne(anyLong())).thenReturn((saleCreating()));
        Sale sale = saleService.getById(1);
        Assert.assertEquals(sale.getId().longValue(), 1);
    }

    @Test
    public void testSave() {
        Sale sale = saleCreating();
        when(saleRepository.save(sale)).thenReturn(saleCreating());
        Sale sale1 = saleRepository.save(sale);
        Assert.assertEquals(sale.getId(), sale1.getId());
        Assert.assertEquals(sale.getNewPrice(), sale1.getNewPrice());
    }

    @Test
    public void testFindAll() {
        List<Sale> sales = new ArrayList<>();
        Sale sale = saleCreating();
        for (int i = 0; i < 1; i++) {
            sales.add(sale);
        }
        when(saleRepository.findAll()).thenReturn(sales);
        List<Sale> sales1 = saleService.getAll();
        Assert.assertEquals(sales.contains(sale), sales1.contains(sale));
    }


    private Sale saleCreating() {
        Sale sale = new Sale();
        sale.setId(1);
        sale.setNewPrice(120);
        return sale;
    }
}
