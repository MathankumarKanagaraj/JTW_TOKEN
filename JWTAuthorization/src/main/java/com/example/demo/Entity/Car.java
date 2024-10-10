package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Car {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;

    private String carModel;
    private String ownerAddress;
    private String carOwnerName;
    private String ratePerHour;
    private String availability;
    private String location;


}
