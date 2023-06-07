package Food_Delivery_Application.MyProject.Services;

import Food_Delivery_Application.MyProject.Models.Promotion;
import Food_Delivery_Application.MyProject.Repositories.PromotionRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PromotionServices {

    @Autowired
    PromotionRepositories promotionRepositories;
    public List<Promotion> getAllPromotion() {

        return promotionRepositories.findAll();
    }

    public Promotion getPromotionById(Integer id) {

        return (Promotion) promotionRepositories.findById(id).get();
    }
}
