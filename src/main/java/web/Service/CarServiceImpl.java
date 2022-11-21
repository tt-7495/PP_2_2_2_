package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
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
//        List<Car> cars = new ArrayList<>();
//        for (int i = 0; i>count; i++){
//            cars.add()
//        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }



}

