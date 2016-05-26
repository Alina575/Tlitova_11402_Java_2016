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
import ru.kpfu.itis.ALINA_TLITOVA.models.Sale;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.SaleRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.SaleService;

import java.util.ArrayList;
import java.util.List;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/web/WEB-INF/root-config.xml"})
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
        when(messageRepository.findOne(anyLong())).thenReturn(messageCreating());
        Message message = messageService.getById(1);
        Assert.assertEquals(message.getId(), 1);
    }

    @Test
    public void testSave() {
        Message message = messageCreating();
        when(messageRepository.save(message)).thenReturn(messageCreating());
        Message message1 = messageService.save(message);
        Assert.assertEquals(message.getId(), message1.getId());
        Assert.assertEquals(message.getTheme(), message1.getTheme());
        Assert.assertEquals(message.getText(), message1.getText());
    }

    @Test
    public void testFindAll() {
        List<Message> messages = new ArrayList<>();
        Message message = messageCreating();
        for (int i = 0; i < 1; i++) {
            messages.add(message);
        }
        when(messageRepository.findAll()).thenReturn(messages);
        List<Message> messages1 = messageService.getAll();
        Assert.assertEquals(messages.contains(message), messages1.contains(message));
    }


    private Sale saleCreating() {
        Sale sale = new Sale();
        message.setId(1);
        message.setTheme("Aaa");
        message.setText("aaa");
        return message;
    }
}
