package com.kodilla.good.patterns.saleService;

import java.time.LocalDate;

public class ShopOneService implements SalesService {

    @Override
    public boolean sale(User user, LocalDate dateOfSale, Product product) {

        return true;
    }
}
