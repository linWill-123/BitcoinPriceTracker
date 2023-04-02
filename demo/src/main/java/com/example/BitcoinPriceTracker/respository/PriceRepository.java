package com.example.BitcoinPriceTracker.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BitcoinPriceTracker.model.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {
    
}