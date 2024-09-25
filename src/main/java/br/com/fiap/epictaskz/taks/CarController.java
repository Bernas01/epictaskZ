package br.com.fiap.epictaskz.taks;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String index(Model model) {
        var cars = carService.findAll();
        model.addAttribute("cars", cars);
        return "index";
    }

    @PostMapping
    public String addCar(@ModelAttribute Car car) {
        carService.save(car);
        return "redirect:/cars";
    }

    @PostMapping("/delete/{id}")
    public String deleteCar(@PathVariable UUID id) {
        carService.delete(id);
        return "redirect:/cars";
    }
}