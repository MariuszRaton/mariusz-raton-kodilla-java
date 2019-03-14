package com.kodilla.stream.world;

import org.junit.*;

import java.math.BigDecimal;

public class WorldTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testGetPeopleQuantity() {

        //Given
        World world = new World();

        Continent europe = new Continent("Europa");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");

        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);

        Country pl = new Country("Poland", new BigDecimal(44256));
        Country eng = new Country("England", new BigDecimal(9995));
        Country it = new Country("Italy", new BigDecimal(66452));

        Country eg = new Country("Egypt", new BigDecimal(777));
        Country rpa = new Country("RPA", new BigDecimal(2222));

        Country ru = new Country("Russia", new BigDecimal(2424470));
        Country prc = new Country("China", new BigDecimal(6641));

        europe.addCountry(pl);
        europe.addCountry(eng);
        europe.addCountry(it);

        africa.addCountry(eg);
        africa.addCountry(rpa);

        asia.addCountry(prc);
        asia.addCountry(ru);

        //When
        BigDecimal totalPeopleQty = world.getPeopleQuantity();

        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("2554813");
        Assert.assertEquals(totalPeopleExpected, totalPeopleQty);
    }
}
