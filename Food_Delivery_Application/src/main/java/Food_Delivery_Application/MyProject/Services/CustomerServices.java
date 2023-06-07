package Food_Delivery_Application.MyProject.Services;

import Food_Delivery_Application.MyProject.Models.Customer;
import Food_Delivery_Application.MyProject.Repositories.CustomerRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServices {

    @Autowired
    CustomerRepositories customerRepositories;
    public List<Customer> getAllCustomer() {

        return customerRepositories.findAll();
    }

    public Customer getCustomerById(Integer id) {

        return (Customer) customerRepositories.findById(id).get();
    }
}
