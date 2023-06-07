package Food_Delivery_Application.MyProject.Services;

import Food_Delivery_Application.MyProject.Models.Menu;
import Food_Delivery_Application.MyProject.Repositories.MenuRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuServices {

    @Autowired
    MenuRepositories menuRepositories;
    public List<Menu> getAllMenu() {

        return menuRepositories.findAll();
    }

    public Menu getMenuById(Integer id) {

        return (Menu) menuRepositories.findById(id).get();
    }
}
