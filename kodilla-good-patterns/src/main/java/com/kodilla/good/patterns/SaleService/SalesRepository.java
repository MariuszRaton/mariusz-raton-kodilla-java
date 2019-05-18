package com.kodilla.good.patterns.SaleService;

import java.time.LocalDate;

public interface SalesRepository {
    void createSaleProduct(User user, Product product, LocalDate dateOfSale);
}
