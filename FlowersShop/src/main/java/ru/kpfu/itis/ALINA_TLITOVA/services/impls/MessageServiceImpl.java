package ru.kpfu.itis.ALINA_TLITOVA.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.ALINA_TLITOVA.forms.MessageForm;
import ru.kpfu.itis.ALINA_TLITOVA.models.Delivery;
import ru.kpfu.itis.ALINA_TLITOVA.models.Message;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.MessageRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.MessageService;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageRepository messageRepository;

    @Override
    public List<Message> getAll() {
        return messageRepository.findAll();
    }

    @Override
    public Message getById(Integer id) {
        return messageRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        messageRepository.delete(id.longValue());
    }

    @Override
    public Message save(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public void saveMessage(MessageForm messageForm) {
        if (messageForm != null) {
            Message message = new Message();
            message.setText(messageForm.getText());
            message.setTheme(messageForm.getTheme());
            messageRepository.save(message);
        }
    }


}
