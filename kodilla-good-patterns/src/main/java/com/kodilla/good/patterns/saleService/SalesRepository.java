package com.kodilla.good.patterns.saleService;

import java.time.LocalDate;

public interface SalesRepository {
    void createSaleProduct(User user, Product product, LocalDate dateOfSale);
}
