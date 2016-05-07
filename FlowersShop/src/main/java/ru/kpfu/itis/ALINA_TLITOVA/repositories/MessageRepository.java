package ru.kpfu.itis.ALINA_TLITOVA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.ALINA_TLITOVA.forms.MessageForm;
import ru.kpfu.itis.ALINA_TLITOVA.models.Message;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface MessageRepository extends JpaRepository<Message, Long> {

    List<Message> findAll();

    Message findByTheme(String name);

    Message findById(Integer id);

    Message findByUserId(Integer user_id);
}
