package Food_Delivery_Application.MyProject.Repositories;

import Food_Delivery_Application.MyProject.Models.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepositories extends JpaRepository<Rating, Integer> {
}
