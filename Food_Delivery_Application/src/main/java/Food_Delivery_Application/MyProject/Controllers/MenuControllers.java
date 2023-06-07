package Food_Delivery_Application.MyProject.Controllers;

import Food_Delivery_Application.MyProject.Services.MenuServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Menu")
public class MenuControllers {
    @Autowired
    MenuServices menuService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List getAllMenu() {

        return menuService.getAllMenu();

    }

}
