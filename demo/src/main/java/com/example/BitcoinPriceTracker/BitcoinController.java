package com.example.BitcoinPriceTracker;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.ui.Model;

import com.example.BitcoinPriceTracker.model.Price;
import com.example.BitcoinPriceTracker.respository.PriceRepository;

@Controller
public class BitcoinController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
    
    @Autowired
    private PriceRepository priceRepository;

    @GetMapping("/price")
    public String price(Model model) {
        List<Price> prices = priceRepository.findAll();
        Price latestPrice = prices.get(prices.size() - 1);
        model.addAttribute("price", latestPrice.getValue());
        return "price";
    }
}
