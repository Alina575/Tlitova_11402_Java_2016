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
import ru.kpfu.itis.ALINA_TLITOVA.models.Product;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.ProductRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.ProductService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/root-config.xml"})
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    @Autowired
    ProductService productService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetById() {
        when(productRepository.findOne(anyLong())).thenReturn(productCreating());
        Product product = productService.getById(1);
        Assert.assertEquals(product.getId().longValue(), 1);
    }

    @Test
    public void testGetByUser_id() {
        when(productRepository.findByUserId(anyInt())).thenReturn(productCreating());
        Product product = productService.getById(1);
        Assert.assertEquals(product.getName(), "Rose");
    }

    @Test
    public void testFindAll() {
        List<Product> products = new ArrayList<>();
        Product product = productCreating();
        for (int i = 0; i < 1; i++) {
            products.add(product);
        }
        when(productRepository.findAll()).thenReturn(products);
        List<Product> products1 = productService.getAll();
        Assert.assertEquals(products.contains(product), products1.contains(product));
    }

    @Test
    public void testSave() {
        Product product = productCreating();
        when(productRepository.save(product)).thenReturn(productCreating());
        Product product1 = productService.save(product);
        Assert.assertEquals(product.getId(), product1.getId());
        Assert.assertEquals(product.getName(), product1.getName());
        Assert.assertEquals(product.getDescr(), product1.getDescr());
        Assert.assertEquals(product.getPrice(), product1.getPrice());
        Assert.assertEquals(product.getType(), product1.getType());
        Assert.assertEquals(product.getDate(), product1.getDate());
    }

    private Product productCreating() {
        Product product = new Product();
        product.setId(1);
        product.setName("Rose");
        product.setDescr("aaa");
        product.setType("bbb");
        product.setPrice(100);
        product.setDate(null);
        return product;
    }

}
