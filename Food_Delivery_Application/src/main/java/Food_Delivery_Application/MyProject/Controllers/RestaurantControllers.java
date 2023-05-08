package Food_Delivery_Application.MyProject.Controllers;

import Food_Delivery_Application.MyProject.Services.RestaurantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Restaurant")
public class RestaurantControllers {
    @Autowired
    RestaurantServices restaurantService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List getAllRestaurant() {

        return restaurantService.getAllRestaurant();

    }
}
