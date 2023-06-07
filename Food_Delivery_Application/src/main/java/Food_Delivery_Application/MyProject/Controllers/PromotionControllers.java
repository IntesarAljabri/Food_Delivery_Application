package Food_Delivery_Application.MyProject.Controllers;

import Food_Delivery_Application.MyProject.Services.PromotionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Promotion")
public class PromotionControllers {
    @Autowired
    PromotionServices promotionService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List getAllPromotion() {

        return promotionService.getAllPromotion();

    }
}
