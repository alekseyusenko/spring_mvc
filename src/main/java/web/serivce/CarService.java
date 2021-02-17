package web.serivce;

import web.models.Car;

import java.util.List;

public interface CarService {

    public List<Car> getCars(List<Car> cars, int quantity);

}
