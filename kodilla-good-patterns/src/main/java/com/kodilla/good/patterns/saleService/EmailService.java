package com.kodilla.good.patterns.saleService;

import java.time.LocalDate;

public class EmailService implements InformationService {
    @Override
    public void inform(User user, Product product, LocalDate dateOfSale, boolean isSold) {
        if (isSold) {
            System.out.println("Hello, " + user.getLogin() + " thank you for ordering " + product.getName());
        } else {
            System.out.println("Hello, " + user.getLogin() + " it doesn't work like that!");
        }
    }
}
