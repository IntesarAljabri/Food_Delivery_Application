package Food_Delivery_Application.MyProject.Controllers;

import Food_Delivery_Application.MyProject.Services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Order")

public class OrderControllers {
    @Autowired
    OrderServices orderService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List getAllOrder() {

        return orderService.getAllOrder();

    }


}
