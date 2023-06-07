package Food_Delivery_Application.MyProject.Controllers;

import Food_Delivery_Application.MyProject.Services.RatingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Rating")
public class RatingControllers {
    @Autowired
    RatingServices ratingService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List getAllRating() {

        return ratingService.getAllRating();

    }
}
