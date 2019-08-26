package com.kodilla.good.patterns.ShopFood2Door;

import java.util.Map;

public class SaleProcessor {

    public boolean sale(Order order) {

        Map<Product, Integer> productList = order.getProductList();

        for (Map.Entry<Product, Integer> entry : productList.entrySet()){
            if (entry.getKey().getProductQuantity() < entry.getValue()) {
                System.out.println("Brak towaru " + entry.getKey().getProductName() + " próbujesz zamówić " + entry.getValue() + "szt Maksymalnie można zamówić " + entry.getKey().getProductQuantity() + "szt");
            }
            entry.getKey().getProvider().process(entry.getKey());
        }
        return true;
    }
}
