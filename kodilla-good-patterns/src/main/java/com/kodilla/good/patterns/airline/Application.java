package com.kodilla.good.patterns.airline;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        Map<String, List<String>> flightsMap = new HashMap<>();
        flightsMap.put("Warszawa", Arrays.asList("Katowice", "Gdańsk"));
        flightsMap.put("Katowice", Arrays.asList("Praga"));
        flightsMap.put("Praga", Arrays.asList("Londyn"));
        flightsMap.put("Londyn", Arrays.asList("Moskwa"));

        FlightProcessor flightProcessor = new FlightProcessor(flightsMap);

        final Map<String, List<String>>  allPossibleFlightFromAirport = flightProcessor.getPossibleFlightFromAirport(flightsMap, "Warszawa");

        final boolean flightPossible = flightProcessor.findFilght("Warszawa", "Moskwa");

        final Map<String, List<String>>  allPossibleFlightToAirport = flightProcessor.getPossibleFlightToAirport(flightsMap, "Praga");
    }
}
