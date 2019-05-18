package com.kodilla.good.patterns.SaleService;

import java.time.LocalDate;

public class ShopOneService implements SalesService {

    @Override
    public boolean sale(User user, LocalDate dateOfSale, Product product) {

        return true;
    }
}
