package ru.kpfu.itis.ALINA_TLITOVA.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.ALINA_TLITOVA.forms.DeliveryForm;
import ru.kpfu.itis.ALINA_TLITOVA.models.Delivery;
import ru.kpfu.itis.ALINA_TLITOVA.models.Product;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.DeliveryRepository;
import ru.kpfu.itis.ALINA_TLITOVA.services.DeliveryService;

import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */

@Service
public class DeliveryServiceImpl implements DeliveryService {
    @Autowired
    DeliveryRepository deliveryRepository;

    @Override
    public List<Delivery> getAll() {
        return deliveryRepository.findAll();
    }

    @Override
    public Delivery getById(Integer id) {
        return deliveryRepository.findById(id);
    }

    @Override
    public Delivery getByUser_id(Integer user_id) {
        return deliveryRepository.findByUser_id(user_id);
    }

    @Override
    public void deleteById(Integer id) {
        deliveryRepository.delete(id);
    }

    @Override
    public void delete(Delivery delivery) {
        deliveryRepository.delete(delivery);
    }

    @Override
    public Delivery save(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    @Override
    public void saveDelivery(DeliveryForm deliveryForm) {
        if (deliveryForm != null) {
            Delivery delivery = new Delivery();
            delivery.setSecondname(deliveryForm.getSecondname());
            delivery.setName(deliveryForm.getName());
            delivery.setLastname(deliveryForm.getLastname());
            delivery.setPhone(deliveryForm.getPhone());
            delivery.setCountry(deliveryForm.getCountry());
            delivery.setCity(deliveryForm.getCity());
            delivery.setStreet(deliveryForm.getStreet());
            delivery.setHouse(deliveryForm.getHouse());
            delivery.setFlat(deliveryForm.getFlat());
            deliveryRepository.save(delivery);
        }
    }


}
