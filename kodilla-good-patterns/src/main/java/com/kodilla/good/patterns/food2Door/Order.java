package com.kodilla.good.patterns.food2Door;

public class Order {
   // private Provider name;
    private String shopName;
    private Providers listOfProviders;

  /*  public Order(Provider name) {
        this.name = name;
    }

    public Provider getProvider() {
        return name;
    }
*/

    public Order(String shopName, Providers listOfProviders) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }
}
