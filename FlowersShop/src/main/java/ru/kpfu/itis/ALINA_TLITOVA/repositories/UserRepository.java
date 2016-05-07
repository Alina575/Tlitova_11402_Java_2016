package ru.kpfu.itis.ALINA_TLITOVA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface UserRepository extends JpaRepository<User, Long> {

    User findByLogin(String login);

    User findById(Integer id);

    List<User> findAll();

}
