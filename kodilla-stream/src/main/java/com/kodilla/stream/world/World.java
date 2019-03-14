package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> listOfContinents = new ArrayList<>();

    public boolean addContinent(Continent continent) {
        return listOfContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQtyOnTheWorld = listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, country) -> sum.add(country));

        return peopleQtyOnTheWorld;
    }
}
