package Food_Delivery_Application.MyProject.Controllers;


import Food_Delivery_Application.MyProject.Services.DeliveryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Delivery")
public class DeliveryControllers {
    @Autowired
    DeliveryServices deliveryService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List getAllDelivery() {

        return deliveryService.getAllDelivery();

    }
}
