package Food_Delivery_Application.MyProject.Services;

import Food_Delivery_Application.MyProject.Models.Order;
import Food_Delivery_Application.MyProject.Repositories.OrderRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServices {


    @Autowired
    OrderRepositories orderRepositories;
    public List<Order> getAllOrder() {

        return orderRepositories.findAll();
    }

    public Order getOrderById(Integer id) {

        return (Order) orderRepositories.findById(id).get();
    }
}
