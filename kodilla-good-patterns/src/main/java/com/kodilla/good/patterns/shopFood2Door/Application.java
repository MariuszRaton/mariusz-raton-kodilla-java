package com.kodilla.good.patterns.shopFood2Door;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        List<Product> productsFromExtraFoodShop = new LinkedList<>();
        List<Product> productsGlutenFreeShop = new LinkedList<>();
        List<Product> productsHealthyShop = new LinkedList<>();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop(productsFromExtraFoodShop);
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(productsGlutenFreeShop);
        HealthyShop healthyShop = new HealthyShop(productsHealthyShop);

        Product product1 = new Product("product1",3, extraFoodShop);
        Product product2 = new Product("product2",2, glutenFreeShop);
        Product product3 = new Product("product3",5, healthyShop);

        productsFromExtraFoodShop.add(product1);
        productsGlutenFreeShop.add(product2);
        productsHealthyShop.add(product3);

        Customer customer = new Customer("Adam");

        Map< Product, Integer> map = new HashMap<>();
        map.put(extraFoodShop.productFromExtraFoodShop.get(0), 1);
        map.put(glutenFreeShop.productGlutenFreeShopp.get(0), 5);
        map.put(healthyShop.productHealthyShop.get(0), 3);

        Order order = new Order(customer, LocalDate.of(2019, 12, 18), map);

        SaleProcessor saleProcessor = new SaleProcessor();
        saleProcessor.sale(order);

    }
}
