package com.example.mk.thymeleafhello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/car")
    public String get(Model model)
    {
        Car car1 =new Car("Fabia", "Skoda");
        Car car2 =new Car("Fusion", "Ford");
        Car car3 =new Car("RX8", "Mazda");
        Car car4 =new Car("Seicento", "Fiat");

        List<Car> list = Arrays.asList(car1, car2, car3, car4);
        model.addAttribute("cars", list);
        return "car";
    }
}


