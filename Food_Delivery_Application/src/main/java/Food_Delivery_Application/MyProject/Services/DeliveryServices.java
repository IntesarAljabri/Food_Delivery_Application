package Food_Delivery_Application.MyProject.Services;

import Food_Delivery_Application.MyProject.Models.Delivery;
import Food_Delivery_Application.MyProject.Repositories.DeliveryRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeliveryServices {



    @Autowired
    DeliveryRepositories deliveryRepositories;
    public List<Delivery> getAllDelivery() {

        return deliveryRepositories.findAll();
    }

    public Delivery getDeliveryById(Integer id) {

        return (Delivery) deliveryRepositories.findById(id).get();
    }
}
