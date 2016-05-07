package ru.kpfu.itis.ALINA_TLITOVA.services;

import ru.kpfu.itis.ALINA_TLITOVA.forms.DeliveryForm;
import ru.kpfu.itis.ALINA_TLITOVA.models.Delivery;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

public interface DeliveryService {
    List<Delivery> getAll();

    Delivery getById(Integer id);

    Delivery getByUser_id(Integer user_id);

    void deleteById(Integer id);

    void delete(Delivery delivery);

    Delivery save(Delivery delivery);

    void saveDelivery(DeliveryForm deliveryForm);
}
