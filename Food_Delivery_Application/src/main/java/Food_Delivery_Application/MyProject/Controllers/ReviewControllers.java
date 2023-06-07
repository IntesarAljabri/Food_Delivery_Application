package Food_Delivery_Application.MyProject.Controllers;

import Food_Delivery_Application.MyProject.Services.ReviewServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Review")
public class ReviewControllers {
    @Autowired
    ReviewServices reviewService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List getAllReview() {

        return reviewService.getAllReview();

    }
}
