package com.kodilla.good.patterns.saleService;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderRetriever {
    Order retrieve() {

        User user = new User("Edward", "Kowalski", "loginEdwarda", "email@test.com");
        Product product = new Product("Sample prod", BigDecimal.valueOf(12.50));
        Order order = new Order(user, LocalDate.of(2019, 5, 18), product);

        return order;
    }
}
