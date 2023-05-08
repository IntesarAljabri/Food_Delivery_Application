package Food_Delivery_Application.MyProject.Services;

import Food_Delivery_Application.MyProject.Models.Payment;
import Food_Delivery_Application.MyProject.Repositories.PaymentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaymentServices {
    @Autowired
    PaymentRepositories paymentRepositories;
    public List<Payment> getAllPayment() {

        return paymentRepositories.findAll();
    }

    public Payment getPaymentById(Integer id) {

        return (Payment) paymentRepositories.findById(id).get();
    }
}
