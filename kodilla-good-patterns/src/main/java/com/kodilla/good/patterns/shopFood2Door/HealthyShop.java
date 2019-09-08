package com.kodilla.good.patterns.shopFood2Door;

import java.util.List;

public class HealthyShop implements Provider {

    List<Product> productHealthyShop;

    @Override
   public String providerName() {
       return "Healthy Shop";
    }

    public HealthyShop(List<Product> productHealthyShop) {
        this.productHealthyShop = productHealthyShop;
    }

    @Override
    public boolean process(Product product) {
        if (product != null) {
            System.out.println("Dostawca Healthy Shop przyjął zamówienie na " + product.getProductName());
        }
        return true;
    }
}
