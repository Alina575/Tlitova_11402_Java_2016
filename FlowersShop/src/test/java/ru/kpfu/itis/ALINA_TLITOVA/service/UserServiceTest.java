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
import ru.kpfu.itis.ALINA_TLITOVA.models.User;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.UserRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.UserService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/root-config.xml"})
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    @Autowired
    UserService userService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetById() {
        when(userRepository.findOne(anyLong())).thenReturn(userCreating());
        User user = userService.getById(1);
        Assert.assertEquals(user.getId().longValue(), 1);
    }

    @Test
    public void testGetByName() {
        when(userRepository.findByLogin(anyString())).thenReturn(userCreating());
        User user = userService.getByLogin("Ann");
        Assert.assertEquals(user.getLogin(), "Ann");
    }

    @Test
    public void testSave() {
        User user = userCreating();
        when(userRepository.save(user)).thenReturn(userCreating());
        User user1 = userService.save(user);
        Assert.assertEquals(user.getId(), user1.getId());
        Assert.assertEquals(user.getLogin(), user1.getLogin());
        Assert.assertEquals(user.getPassword(), user1.getPassword());
        Assert.assertEquals(user.getPhone(), user1.getPhone());
    }

    @Test
    public void testFindAll() {
        List<User> users = new ArrayList<>();
        User user = userCreating();
        for (int i = 0; i < 1; i++) {
            users.add(user);
        }
        when(userRepository.findAll()).thenReturn(users);
        List<User> users1 = userService.getAll();
        Assert.assertEquals(users.contains(user), users1.contains(user));
    }


    private User userCreating() {
        User user = new User();
        user.setId(1);
        user.setLogin("Ann");
        user.setPassword("aaa");
        user.setPhone("898989");
        return user;
    }
}
