package ru.kpfu.itis.ALINA_TLITOVA.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.ALINA_TLITOVA.forms.RegistrationForm;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.UserRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.UserService;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Service
public class UserServiceImpl implements UserService {
    private static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public User getByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void saveUser(RegistrationForm registrationForm) {
        if (registrationForm != null || (registrationForm.getPassword()
                .equals(registrationForm.getConfpassword()))) {
            User user = new User();
            user.setLogin(registrationForm.getLogin());
            user.setPhone(registrationForm.getPhone());
            user.setPassword(encoder.encode(registrationForm.getPassword()));
            user.setRole(registrationForm.getRole());
            userRepository.save(user);

        }
    }
}