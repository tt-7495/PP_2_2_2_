package web.Service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> index();

    List<Car> getCars(int count);
}
