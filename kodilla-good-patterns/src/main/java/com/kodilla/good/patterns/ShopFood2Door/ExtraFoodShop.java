package com.kodilla.good.patterns.ShopFood2Door;

public class ExtraFoodShop implements Provider {

    @Override
    public String providerName() {
        return "Extra Food Shop";
    }

    @Override
    public boolean process(final Product product) {
        if(product != null) {
            System.out.println("Złożono zamówienie w ExtraFoodShop na " + product.getProductName());
        }
        return true;
    }
}
