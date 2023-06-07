package Food_Delivery_Application.MyProject.Controllers;

import Food_Delivery_Application.MyProject.Services.PaymentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Payment")
public class PaymentControllers {
    @Autowired
    PaymentServices paymentService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List getAllPayment() {

        return paymentService.getAllPayment();

    }

}
