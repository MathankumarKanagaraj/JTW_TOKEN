package com.example.demo.Controller;

import com.example.demo.Entity.Car;
import com.example.demo.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping("/")
    public Car car(@RequestBody final Car car) {
        return this.carService.saveCar(car);
    }


    @GetMapping("/get-car")
    public List<Car> getAllCar() {
        return carService.getAllCar();
    }

    @PutMapping("/update-car")
    public Car updateCar(@PathVariable String id, @RequestBody Car carDetails) {
        return carService.updateCar(id, carDetails);
    }


    @DeleteMapping("/delete-user")
    public void deleteCar(@PathVariable String id) {
        carService.deleteCar(id);
    }
}