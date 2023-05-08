package Food_Delivery_Application.MyProject.Services;

import Food_Delivery_Application.MyProject.Models.Review;
import Food_Delivery_Application.MyProject.Repositories.ReviewRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewServices {

    @Autowired
    ReviewRepositories reviewRepositories;
    public List<Review> getAllReview() {

        return reviewRepositories.findAll();
    }

    public Review getReviewById(Integer id) {

        return (Review) reviewRepositories.findById(id).get();
    }
}
