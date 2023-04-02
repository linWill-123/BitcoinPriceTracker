package com.example.BitcoinPriceTracker.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Price {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Double value;
    
    private LocalDateTime timestamp;
    
    // Getters and setters
    public double getValue() {
        return this.value;
    }

    public LocalDateTime getTime() {
        return this.timestamp;
    }
}