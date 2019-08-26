package com.kodilla.good.patterns.ShopFood2Door;

public class GlutenFreeShop implements Provider {

    @Override
    public String providerName() {
        return "Gluten Free Shop";
    }

    @Override
    public boolean process(final Product product) {

        if (product != null) {
            System.out.println("Nasz dostawca " + product.getProvider().providerName() + " przyjął zamówienie na "+ product.getProductName());
        }
        return true;
    }
}
