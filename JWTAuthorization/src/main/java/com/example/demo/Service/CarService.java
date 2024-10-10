package com.example.demo.Service;

import com.example.demo.Entity.Car;
import com.example.demo.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public Car saveCar(Car car){
        return carRepository.save(car);
    }

    public List<Car> getAllCar() {
        return carRepository.findAll();
    }

    public Car updateCar(String id, Car carDetails) {
        Optional<Car> optionalCar = carRepository.findById(id.toString());
        if (optionalCar.isPresent()) {
            Car car = optionalCar.get();
            car.setCarModel(carDetails.getCarModel());
            car.setOwnerAddress(carDetails.getOwnerAddress());
            car.setCarOwnerName(carDetails.getCarOwnerName());
            car.setRatePerHour(carDetails.getRatePerHour());
            car.setAvailability(carDetails.getAvailability());
            car.setLocation(carDetails.getLocation());
            return carRepository.save(car);
        } else return null;
    }

    public void deleteCar(String id) {
        carRepository.deleteById(id);
    }
}