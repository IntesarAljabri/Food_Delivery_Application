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

    @Column(name = "Restaurant_name")
    String name;

    @Column(name = "Restaurant_Location")
    String location;

    @Column(name = "Promotions_Time_OPEN")
    String timeOpen;

    @Column(name = "Promotions_Time_CLOSE")
    String timeClose;
}