package com.kodilla.good.patterns.rentalProcessorExample;

public class Application {
    public static void main(String[] args) {
        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(
                new MailService(), new CarRentalService(), new CarRentalRepository());
         rentalProcessor.process(rentRequest);

        //RentalProcessor rentalProcessor = new RentalProcessor(
        //        new MailService(), new CarRentalService(), new CarRentalRepository());
       // rentalProcessor.process(rentRequest);

    }
}
