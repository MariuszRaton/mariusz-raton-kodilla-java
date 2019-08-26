package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;

public class Providers {
   // private String name;
   // private Map<String, Map<String, Integer>> productsOfProviders;
    // private final Map<ProductsOfProvider> productsList;
   private Map<String, Map<String, Integer>> listOfProviders = new HashMap<>();

  //  public Providers( Map<String, Map<String, Integer>> listOfProviders) {
   //     this.listOfProviders = listOfProviders;
  //  }


    public Map<String, Map<String, Integer>> setListOfProviders(String name, Map<String, Integer> productsOfProvider) {
        listOfProviders.put(name, productsOfProvider);
        return listOfProviders;
    }

    public Map<String, Map<String, Integer>> getlistOfProviders() {
        return listOfProviders;
    }

    @Override
    public String toString() {
        return "Providers{"  +
                ", productsOfProviders =" + listOfProviders +
                '}';
    }

    /*
    public Provider(String name, Map<String, Integer> productsOfProvider) {
        this.name = name;
        this.productsOfProvider = productsOfProvider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getProductsOfProvider() {
        return productsOfProvider;
    }

    public void setProductsOfProvider(Map<String, Integer> productsOfProvider) {
        this.productsOfProvider = productsOfProvider;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "name='" + name + '\'' +
                ", productsOfProvider=" + productsOfProvider +
                '}';
    }



    public Provider(String name, String surname, String login, String email) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    */
}
