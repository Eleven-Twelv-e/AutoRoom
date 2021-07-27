import java.util.ArrayList;
import java.util.List;

public class AutoRoom {

    Seller seller = new Seller(this);
    List<Car> cars = new ArrayList<>(10);


    public Car sellCar(){
        return seller.sellCar();
    }


    public void acceptCar(){
        seller.produseCar();
    }

    List<Car> getCars(){
        return cars;
    }

}
