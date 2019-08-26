package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;

public class ProductsOfProvider {
  //  private String product;
 //   private Integer quantity;
    private Map<String, Integer> productsOfProvider = new HashMap<>();

    /*
    public ProductsOfProvider(String product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }
*/
    public Map<String, Integer> addProductsOfProvider(String product, Integer quantity) {
        productsOfProvider.put(product, quantity);
        return productsOfProvider;
    }

   // public Map<String, Integer> getProductsOfProvider(String product, Integer quantity) {
   public Map<String, Integer> getProductsOfProvider() {
        return productsOfProvider;
    }

    @Override
    public String toString() {
        return "Produkty dostawcy {" +
            //    "product='" + product + '\'' +
             //   ", quantity=" + quantity +
                ", productsOfProvider = "
                + productsOfProvider +
                '}';
    }
}
