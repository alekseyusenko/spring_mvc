package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.serivce.CarServiceImpl;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    List<Car> cars = Arrays.asList(new Car("BMW", "red", 220),
            new Car("Volga", "grey", 150),
            new Car("Oka", "green", 100),
            new Car("Audi", "black", 300),
            new Car("Mercedes", "white", 270));

    @GetMapping("/cars")
    public String carsPage(@RequestParam(name = "count", required = false) Integer count,
                          Model model) {

        CarServiceImpl carService = new CarServiceImpl();

        List<Car> result = cars;

        if(count != null)
            result = carService.getCars(cars, count);

        model.addAttribute("cars", result);

        return "cars";
    }



}
