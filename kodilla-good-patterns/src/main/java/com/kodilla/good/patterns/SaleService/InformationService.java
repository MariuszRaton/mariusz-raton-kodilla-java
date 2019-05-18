package com.kodilla.good.patterns.SaleService;

import java.time.LocalDate;

public interface InformationService {
    void inform(User user, Product product, LocalDate dateOfSale, boolean isSold);
}
