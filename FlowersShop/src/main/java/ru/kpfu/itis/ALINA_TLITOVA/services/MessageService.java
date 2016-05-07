package ru.kpfu.itis.ALINA_TLITOVA.services;

import ru.kpfu.itis.ALINA_TLITOVA.forms.MessageForm;
import ru.kpfu.itis.ALINA_TLITOVA.models.Message;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 *         02.05.2016
 */

public interface MessageService {

    List<Message> getAll();

    Message getById(Integer id);

    void deleteById(Integer id);

    Message save(Message message);

    void saveMessage(MessageForm messageForm);
}
