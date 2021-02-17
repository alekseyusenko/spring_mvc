package web.serivce;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(List<Car> cars, int quantity) {

        return cars.stream().limit(quantity).collect(Collectors.toList());

    }
}
