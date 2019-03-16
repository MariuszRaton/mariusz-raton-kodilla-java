package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test class OddNumbersExterminator: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test class OddNumbersExterminator: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){

        //Given
        OddNumbersExterminator emptyListTest = new  OddNumbersExterminator();

        //When
        List<Integer> emptyList = emptyListTest.emptyList();
        List<Integer> result = emptyListTest.exterminate(emptyList);

        List<Integer> expectedList = new ArrayList<>();

        //Then
        Assert.assertEquals("The list is empty", expectedList, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        //Given
        OddNumbersExterminator evenNumbers = new  OddNumbersExterminator();

        //When
        List<Integer> evenList = evenNumbers.listOfNumbers();
        List<Integer> result = evenNumbers.exterminate(evenList);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);
        expectedList.add(8);

        //Then
        Assert.assertEquals("The list is correct", expectedList, result);
    }
}
