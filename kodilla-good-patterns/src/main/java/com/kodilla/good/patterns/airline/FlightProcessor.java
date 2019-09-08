package com.kodilla.good.patterns.airline;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FlightProcessor {

    private final Map<String, List<String>> flightsMap;

    public FlightProcessor(Map<String, List<String>> flightsMap) {
        this.flightsMap = flightsMap;
    }

    public boolean findFilght(String departureAirport, String arrivalAirport) {

        if (!flightsMap.containsKey(departureAirport)) {
            return false;
        }

        if (flightsMap.get(departureAirport).contains(arrivalAirport)) {
            System.out.println("Lot na lotnisko: " + arrivalAirport + " możliwy z przesiadkami: ");
            return  true;
        }

        for (String newDepartureAirport : flightsMap.get(departureAirport)) {
            if (findFilght(newDepartureAirport, arrivalAirport)) {
                System.out.println("Przesiadka na lotnisku: " + newDepartureAirport);
                return true;
            }
        }
        return false;
    }

    public Map<String, List<String>> getPossibleFlightFromAirport(Map<String, List<String>> flightsMap, String departureAirport) {

        System.out.println("Wszystkie bezpośrednie loty z lotniska " + departureAirport + ": ");
        flightsMap.get(departureAirport).stream()
                .forEach(System.out::println);

        System.out.println("");
        return flightsMap;
    }

    public Map<String, List<String>> getPossibleFlightToAirport(Map<String, List<String>> flightsMap, String arrivalAirport) {

        System.out.println("\nBezpośredni lot na lotnisko " + arrivalAirport + " możliwy z lotniska: ");
        flightsMap.get(arrivalAirport).stream()
                .forEach(System.out::println);

        return flightsMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightProcessor that = (FlightProcessor) o;
        return flightsMap.equals(that.flightsMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightsMap);
    }
}
