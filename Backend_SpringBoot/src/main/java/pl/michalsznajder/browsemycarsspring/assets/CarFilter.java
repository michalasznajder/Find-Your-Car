package pl.michalsznajder.browsemycarsspring.assets;

import org.springframework.stereotype.Component;
import pl.michalsznajder.browsemycarsspring.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class CarFilter {

    public List<Car> filter(Iterable<Car> cars, Map<String, String> params) throws NumberFormatException{
        List<Car> carList = new ArrayList<Car>();
        for (Car car : cars) {
            carList.add(car);
        }

        if(params.keySet().contains("mark")) {
            carList.removeIf(car -> !car.getModel().getMark().getName().toLowerCase().equals(params.get("mark").toLowerCase()));
        }
        if(params.keySet().contains("model")) {
            carList.removeIf(car -> !car.getModel().getName().toLowerCase().equals(params.get("model").toLowerCase()));
        }
        if(params.keySet().contains("yearfrom")) {
            carList.removeIf(car -> car.getYearOfProduction() < Integer.parseInt(params.get("yearfrom")));
        }
        if(params.keySet().contains("yearto")) {
            carList.removeIf(car -> car.getYearOfProduction() > Integer.parseInt(params.get("yearto")));
        }
        if(params.keySet().contains("search")) {
            carList.removeIf(car -> !car.getDescription().toLowerCase().contains(params.get("search").toLowerCase()));
        }
        if(params.keySet().contains("pricefrom")) {
            carList.removeIf(car -> car.getPrice() < Integer.parseInt(params.get("pricefrom")));
        }
        if(params.keySet().contains("priceto")) {
            carList.removeIf(car -> car.getPrice() > Integer.parseInt(params.get("priceto")));
        }


        return carList;
    }
}
