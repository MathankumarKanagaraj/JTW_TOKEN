package com.example.demo.Repository;

import com.example.demo.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface CarRepository extends JpaRepository<Car,String> {
}
