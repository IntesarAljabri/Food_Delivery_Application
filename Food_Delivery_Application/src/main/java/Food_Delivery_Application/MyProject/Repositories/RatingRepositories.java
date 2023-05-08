package Food_Delivery_Application.MyProject.Repositories;

import Food_Delivery_Application.MyProject.Models.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepositories extends JpaRepository<Rating, Integer> {
}
