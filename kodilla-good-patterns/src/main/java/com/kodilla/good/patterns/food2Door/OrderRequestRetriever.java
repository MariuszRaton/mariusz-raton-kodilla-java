package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetriever {

    public OrderRequestRetriever retrieve() {

      //  Provider productsOfExtraFoodShop = new Provider("extraFoodShop", new ProductsOfProvider("Chleb", 2));
      //  Map<String, Integer> productsOfExtraFoodShop = extraFoodShop.getProductsOfProviders("Chleb", 1);


     //   Map<String, Integer> productsOfExtraFoodShop = new HashMap<>();
    //    productsOfExtraFoodShop.put("Chleb", 1);

        Map<String, Integer> productsOfHealthyShop = new HashMap<>();
        productsOfHealthyShop.put("Syrop", 2);

        Map<String, Integer> productsOfGlutenFreeShop = new HashMap<>();
        productsOfHealthyShop.put("Kaszka", 3);

/*
        Map<String, productsOfProvider> listOfProviders = new HashMap<>();
        listOfProviders.put("ExtraFoodShop", productsOfExtraFoodShop);
        listOfProviders.put("HealthyShop", productsOfHealthyShop);
        listOfProviders.put("GlutenFreeShop", productsOfGlutenFreeShop);


        Providers providers = new Providers( listOfProviders);
*/
        return new OrderRequestRetriever();
    }

/* HealthyShop  GlutenFreeShop
    public RentRequest retrieve() {
        User user = new User("John", "Wekl");

        LocalDateTime rentFrom = LocalDateTime.of(2017, 8, 1, 12, 0);
        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 0);

        return new RentRequest(user, rentFrom, rentTo);
    }
   */
}
