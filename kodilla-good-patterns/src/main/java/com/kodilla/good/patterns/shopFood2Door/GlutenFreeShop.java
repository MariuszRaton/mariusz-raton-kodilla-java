package com.kodilla.good.patterns.shopFood2Door;

import java.util.List;

public class GlutenFreeShop implements Provider {

    List<Product> productGlutenFreeShopp;

   @Override
    public String providerName() {
        return "Gluten Free Shop";
    }

    public GlutenFreeShop(List<Product> productGlutenFreeShopp) {
        this.productGlutenFreeShopp = productGlutenFreeShopp;
    }

    @Override
    public boolean process(Product product) {

        if (product != null) {
            System.out.println("Nasz dostawca " + product.getProvider().providerName() + " przyjął zamówienie na "+ product.getProductName());
        }
        return true;
    }
}
