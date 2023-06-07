package Food_Delivery_Application.MyProject.Services;

import Food_Delivery_Application.MyProject.Models.Restaurant;
import Food_Delivery_Application.MyProject.Repositories.RestaurantRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantServices {


    @Autowired
    RestaurantRepositories restaurantRepositories;
    public List<Restaurant> getAllRestaurant() {

        return restaurantRepositories.findAll();
    }

    public Restaurant getRestaurantById(Integer id) {

        return (Restaurant) restaurantRepositories.findById(id).get();
    }

}
