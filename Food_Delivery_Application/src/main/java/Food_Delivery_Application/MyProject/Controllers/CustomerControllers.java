package Food_Delivery_Application.MyProject.Controllers;

import Food_Delivery_Application.MyProject.Models.Customer;
import Food_Delivery_Application.MyProject.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("Customer")
public class CustomerControllers {
        @Autowired
        CustomerServices customerService;
        @RequestMapping(value = "getAll", method = RequestMethod.GET)
        public List getAllCustomer() {

                return customerService.getAllCustomer();

        }
}
