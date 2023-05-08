package Food_Delivery_Application.MyProject.Repositories;

import Food_Delivery_Application.MyProject.Models.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepositories extends JpaRepository<Delivery, Integer> {
}
