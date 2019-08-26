package com.kodilla.good.patterns.food2Door;

public class Application {
    public static void main(String[] args) {

        ProductsOfProvider productsOfExtraFoodShop = new ProductsOfProvider();
        productsOfExtraFoodShop.addProductsOfProvider("Chleb", 1);
        productsOfExtraFoodShop.addProductsOfProvider("mlko", 2);

        ProductsOfProvider productsOfHealthyShop = new ProductsOfProvider();
        productsOfHealthyShop.addProductsOfProvider("Syrop", 3);
        productsOfHealthyShop.addProductsOfProvider("Tabletka", 10);

       // System.out.println(productsOfExtraFoodShop);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop", productsOfExtraFoodShop);

        Providers listOfProviders = new Providers();
       // listOfProviders.setListOfProviders("ExtraFoodShop", productsOfExtraFoodShop.getProductsOfProvider());
       // listOfProviders.setListOfProviders("HealthyShop", productsOfHealthyShop.getProductsOfProvider());



       // Map<String, ProductsOfProvider> listOfProviders = new HashMap<>();
       // listOfProviders.put("ExtraFoodShop", productsOfExtraFoodShop);
       // listOfProviders.put("HealthyShop", productsOfHealthyShop);

        Order orderOfExtraFoodShop = new Order("aaa", listOfProviders);
       // orderOfExtraFoodShop.getShopName();

        //orderOfExtraFoodShop

      //  Provider extraFoodShop = new Provider("ExtraFoodShop", productsOfExtraFoodShop);

        System.out.println(listOfProviders);
        System.out.println(orderOfExtraFoodShop.getShopName());

       // OrderProcessor orderProcessor = OrderProcessor();
       // Order order = new Order();

    /*    RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(
                new MailService(), new CarRentalService(), new CarRentalRepository());
        rentalProcessor.process(rentRequest);

        System.out.println(rentRequest);

        //RentalProcessor rentalProcessor = new RentalProcessor(
        //        new MailService(), new CarRentalService(), new CarRentalRepository());
        // rentalProcessor.process(rentRequest);
*/


    }

}
