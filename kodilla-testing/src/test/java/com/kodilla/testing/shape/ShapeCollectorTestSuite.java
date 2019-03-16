package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;

public class ShapeCollectorTestSuite {
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
    public void testAddFigure() {
        //Given
        ShapeCollector newShape = new ShapeCollector();
        //When
        newShape.addFigure(new Circle("circle one", 3));
        //Then
        Assert.assertEquals(1, newShape.getListOfShapesSize());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector newShape = new ShapeCollector();
        //When
        boolean result = newShape.removeFigure(new Circle("circle one", 3));
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure(){
        //Given
        int n = 0;
        ShapeCollector newShape = new ShapeCollector();
        //When
        Shape expectedShape  = newShape.addFigure(new Circle("circle one", 3));
        Shape exampleShape = newShape.getFigure(0);
        //Then
        Assert.assertEquals(expectedShape, exampleShape);
    }

    @Test
    public void testgetField(){
        //Given
        double expectedShape = 113.094;
        ShapeCollector newShape = new ShapeCollector();
        //When
        Shape exampleShape = newShape.addFigure(new Circle("circle one", 6));
        double getExampleShape = exampleShape.getField();
        //Then
        Assert.assertEquals(expectedShape, getExampleShape, 0.01);
    }
}
