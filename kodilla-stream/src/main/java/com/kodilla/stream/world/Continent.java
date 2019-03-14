package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> listOfCountries = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public boolean addCountry(Country country) {
        return listOfCountries.add(country);
    }

    public List<Country> getListOfCountries() {
        return new ArrayList<>(listOfCountries);
    }
}
