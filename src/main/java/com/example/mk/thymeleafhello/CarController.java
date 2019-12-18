package com.example.mk.thymeleafhello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    private List<Car> list;

    public CarController() {
        Car car1 =new Car("Fabia", "Skoda");
        Car car2 =new Car("Fusion", "Ford");
        Car car3 =new Car("RX8", "Mazda");
        Car car4 =new Car("Seicento", "Fiat");
        list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
    }

    @GetMapping("/car")
    public String get(Model model)
    {
        model.addAttribute("cars", list);
        model.addAttribute("newCar", new Car());
        return "car";
    }

    @PostMapping("/add-car")
    public String addCar(@ModelAttribute Car car)
    {
        list.add(car);
        System.out.println(car);
        return "redirect:/car";
    }
}


