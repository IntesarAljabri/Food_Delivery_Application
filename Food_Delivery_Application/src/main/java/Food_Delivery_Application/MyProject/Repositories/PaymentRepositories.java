package Food_Delivery_Application.MyProject.Repositories;

import Food_Delivery_Application.MyProject.Models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepositories extends JpaRepository<Payment, Integer> {
}
