package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> carList;

    public CarDaoImpl() {
        carList = new ArrayList<>();
        carList.add(new Car("Mercedes", "X5", 200));
        carList.add(new Car("Citroen", "Picasso", 220));
        carList.add(new Car("Nissan", "R34", 280));
        carList.add(new Car("BMW", "X5M", 290));
        carList.add(new Car("Lada", "2101", 120));

    }

    @Override
    public List<Car> getCarsList(int count) {
        if (count >= 0) {
            return carList.stream().limit(count).collect(Collectors.toList());
        } else {
            return null;
        }
    }
}
