package com.kodilla.good.patterns.shopFood2Door;

import java.util.List;

public class ExtraFoodShop implements Provider {

    List<Product> productFromExtraFoodShop;

    @Override
    public String providerName() {
        return "Extra Food Shop";
    }

    public ExtraFoodShop( List<Product> productFromExtraFoodShop) {
        this.productFromExtraFoodShop = productFromExtraFoodShop;
    }

    @Override
    public boolean process(Product product) {
        if(product != null ) {
            System.out.println("Złożono zamówienie w ExtraFoodShop na " + product.getProductName());
        }
        return true;
    }
}
