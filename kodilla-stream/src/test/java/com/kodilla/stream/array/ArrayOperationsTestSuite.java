package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class
ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        int[] data = {1, 2, 3, 4, 56, 7, 89, 54, 6, 456, 213, 546, 213, 54, 5, 4, 84, 87, 7, 845, 45, 1, 5};
        Average average = new Average();
        average.getAverage(data);

        Assert.assertEquals(121.173, average.getResult(), 0.001);
    }

    @Test
    public void testGetEmptyArray() {

        int[] data = {};

        Assert.assertEquals("Lista jest pusta", data.length == 0 , true);
    }
}
