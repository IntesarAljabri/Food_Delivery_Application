package Food_Delivery_Application.MyProject.Repositories;

import Food_Delivery_Application.MyProject.Models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepositories extends JpaRepository<Review, Integer> {
}
