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
import ru.kpfu.itis.ALINA_TLITOVA.models.Users;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.UserRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.UserService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/web/WEB-INF/root-config.xml"})
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
        Users user = userService.getById(1);
        Assert.assertEquals(user.getId().longValue(), 1);
    }

    @Test
    public void testGetByName() {
        when(userRepository.findByLogin(anyString())).thenReturn(userCreating());
        Users user = userService.getByLogin("Ann");
        Assert.assertEquals(user.getLogin(), "Ann");
    }

    @Test
    public void testSave() {
        Users user = userCreating();
        when(userRepository.save(user)).thenReturn(userCreating());
        Users user1 = userService.save(user);
        Assert.assertEquals(user.getId(), user1.getId());
        Assert.assertEquals(user.getLogin(), user1.getLogin());
        Assert.assertEquals(user.getPassword(), user1.getPassword());
        Assert.assertEquals(user.getEmail(), user1.getEmail());
    }

    @Test
    public void testFindAll() {
        List<Users> users = new ArrayList<>();
        Users user = userCreating();
        for (int i = 0; i < 1; i++) {
            users.add(user);
        }
        when(userRepository.findAll()).thenReturn(users);
        List<Users> users1 = userService.getAll();
        Assert.assertEquals(users.contains(user), users1.contains(user));
    }


    private Users userCreating() {
        Users user = new Users();
        user.setId(1);
        user.setLogin("Ann");
        user.setPassword("aaa");
        user.setEmail("a@mail.ru");
        return user;
    }
}
