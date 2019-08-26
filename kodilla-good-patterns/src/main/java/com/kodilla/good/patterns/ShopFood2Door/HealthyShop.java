package com.kodilla.good.patterns.ShopFood2Door;

public class HealthyShop implements Provider {

    @Override
    public String providerName() {
        return "Healthy Shop";
    }

    @Override
    public boolean process(final Product product) {
        if (product != null) {
            System.out.println("Dostawca Healthy Shop przyjął zamówienie na " + product.getProductName());
        }
        return true;
    }
}
