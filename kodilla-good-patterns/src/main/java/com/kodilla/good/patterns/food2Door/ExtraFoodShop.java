package com.kodilla.good.patterns.food2Door;

import java.time.LocalDate;

public class ExtraFoodShop implements Provider{
    public String name = "ExtraFoodShop";
    private LocalDate expirationDate;
    public ProductsOfProvider productsOfExtraFoodShop;

    public ExtraFoodShop(String name, ProductsOfProvider productsOfExtraFoodShop) {
        this.name = name;
        this.productsOfExtraFoodShop = productsOfExtraFoodShop;
    }

//  public Provider(String name, ProductsOfProvider productsOfProvider) {
    //     this.name = name;

    //  }


    @Override
    public String name() {
        return null;
    }

    @Override
    public ProductsOfProvider productsOfProvider() {
        return null;
    }

    public boolean process(Order order, ProductsOfProvider productsOfExtraFoodShop){
    return true;
    }

    public String getName() {
        return name;
    }

    public ProductsOfProvider getProductsOfProvider() {
        return productsOfExtraFoodShop;
    }

    /*
    public Map<String, Integer> getProductsOfProviders(String product, Integer quantity) {
        productsOfProvider.put(product, quantity);

        return productsOfProvider;
    }
    */

    @Override
    public String toString() {
        return "Provider{" +
                "name='" + name + '\'' +
                ", productsOfProvider=" + productsOfExtraFoodShop +
                '}';
    }
}