package Food_Delivery_Application.MyProject.Services;

import Food_Delivery_Application.MyProject.Models.Rating;
import Food_Delivery_Application.MyProject.Repositories.RatingRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServices {


    @Autowired
    RatingRepositories ratingRepositories;
    public List<Rating> getAllRating() {

        return ratingRepositories.findAll();
    }

    public Rating getRatingById(Integer id) {

        return (Rating) ratingRepositories.findById(id).get();
    }
}
