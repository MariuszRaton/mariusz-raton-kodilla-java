package com.kodilla.good.patterns.ShopFood2Door;

import java.util.Map;

public class SaleProcessor {
    private Order order;

    public SaleProcessor(Order order) {
        this.order = order;
    }

    public boolean sale() {

        Map<Product, Integer> productList = order.getProductList();

        for (Map.Entry<Product, Integer> key : productList.entrySet()){
            if (key.getValue() == 0) {
                 System.out.println("Brak towaru " + key.getKey().getProductName() + " dostawcy " + key.getKey().getProvider().providerName());
                 return false;
            }
            key.getKey().getProvider().process(key.getKey());
        }
        return true;
    }
}
