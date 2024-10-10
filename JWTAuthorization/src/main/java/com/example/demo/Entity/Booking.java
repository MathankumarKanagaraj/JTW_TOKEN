package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.id.enhanced.LegacyNamingStrategy;

@Entity
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;

    private String startLocation;
    private String endLocation;
    private Long startTime;
    private Long endTime;
    private Long totalCast;


}
