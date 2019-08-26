package com.kodilla.good.patterns.ShopFood2Door;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        Customer customer = new Customer("Adam");
        Product product1 = new Product("product1", new ExtraFoodShop(), 1);
        Product product2 = new Product("product2", new ExtraFoodShop(), 5);
        Product product3 = new Product("product3", new HealthyShop(), 4);
        Product product4 = new Product("product4", new HealthyShop(), 3);
        Product product5 = new Product("product5", new GlutenFreeShop(), 3);

        Map<Product, Integer> map = new HashMap<>();
        map.put(product1, 1);
        map.put(product2, 2);
        map.put(product3, 7);
        map.put(product4, 2);
        map.put(product5, 10);

        Order order = new Order(customer, LocalDate.of(2019, 12, 18), map);

        SaleProcessor saleProcessor = new SaleProcessor();
        saleProcessor.sale(order);

    }
}
