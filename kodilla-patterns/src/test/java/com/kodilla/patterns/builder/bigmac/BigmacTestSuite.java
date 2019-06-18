package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(0)
                .ingredient("Chees")
                .ingredient("Onion")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String burgerWithoutBuns = bigmac.getBun();
        //Then
        Assert.assertEquals(2, howManyIngredients);
        Assert.assertEquals(1, howManyBurgers);
        Assert.assertNotEquals(0, burgerWithoutBuns);
    }
}
