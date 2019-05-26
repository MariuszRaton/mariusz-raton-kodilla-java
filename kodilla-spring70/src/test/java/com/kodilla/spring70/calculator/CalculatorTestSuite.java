package com.kodilla.spring70.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculationsAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring70");
        Calculator calculator  = context.getBean(Calculator.class);
        //When
        //library.loadFromDb();
         double addResult =   calculator.add(3,2);
        //Then
        Assert.assertEquals(5, addResult, 0.1);
    }

    @Test
    public void testCalculationsSub() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring70");
        Calculator calculator  = context.getBean(Calculator.class);
        //When
        double subResult =   calculator.sub(3,2);
        //Then
        Assert.assertEquals(1, subResult, 0.1);
    }

    @Test
    public void testCalculationsMul() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring70");
        Calculator calculator  = context.getBean(Calculator.class);
        //When
        double mulResult =   calculator.mul(3,2);
        //Then
        Assert.assertEquals(6, mulResult, 0.1);
    }

    @Test
    public void testCalculationsDiv() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring70");
        Calculator calculator  = context.getBean(Calculator.class);
        //When
        double divResult =   calculator.div(3,2);
        //Then
        Assert.assertEquals(1.5, divResult, 0.1);
    }
}
