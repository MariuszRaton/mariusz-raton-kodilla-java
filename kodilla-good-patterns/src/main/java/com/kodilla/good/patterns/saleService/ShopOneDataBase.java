package com.kodilla.good.patterns.saleService;

import java.time.LocalDate;

public class ShopOneDataBase implements SalesRepository {
    @Override
    public void createSaleProduct(User user, Product product, LocalDate dateOfSale) {
        System.out.println("sale established");
    }
}
