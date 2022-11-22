package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1, "BMW", "X1"));
        cars.add(new Car(2, "BMW", "X3"));
        cars.add(new Car(3, "BMW", "X5"));
        cars.add(new Car(4, "BMW", "X6"));
        cars.add(new Car(5, "BMW", "X7"));
    }
    @Override
    public List<Car> index() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

