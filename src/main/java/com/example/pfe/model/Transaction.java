package com.example.pfe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "StationId", nullable = false)
    private Station station;

    @ManyToOne
    private Pump pump;

    @ManyToOne
    private FuelType fuelType;

    @ManyToOne
    private User user;

    private double quantity;
    private double amount;
    private LocalDateTime transactionDate;
}
