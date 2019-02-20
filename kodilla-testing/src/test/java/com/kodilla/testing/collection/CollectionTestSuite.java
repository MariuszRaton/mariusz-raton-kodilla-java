package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class CollectionTestSuite {
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator evenNumbers = new  OddNumbersExterminator();
        //When
        Boolean result = evenNumbers.listOfNumbers().isEmpty();
        //Then
        Assert.assertFalse("The list is not empty", result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator evenNumbers = new  OddNumbersExterminator();
        //When
        ArrayList<Integer> evenList = (ArrayList<Integer>) evenNumbers.listOfNumbers();
        Boolean result = evenNumbers.exterminate(evenList).isEmpty();
        //Then
        Assert.assertFalse("The list is correct", result);
    }
}
