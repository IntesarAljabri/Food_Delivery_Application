package Food_Delivery_Application.MyProject.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "RestaurantName")
    String name;

    @Column(name = "RestaurantLocation")
    String location;

    @Column(name = "PromotionsTimeOPEN")
    String timeOpen;

    @Column(name = "PromotionsTimeCLOSE")
    String timeClose;
}