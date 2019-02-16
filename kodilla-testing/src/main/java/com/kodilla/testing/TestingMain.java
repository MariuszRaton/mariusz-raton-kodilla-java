package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args){
        Calculator simpleCalculator = new Calculator();

        int resultAdd = simpleCalculator.add(5, 2);

        if (resultAdd > 0 || resultAdd < 0 || resultAdd == 0){
            System.out.println("test method add OK");
        } else {
            System.out.println("Error! method add");
        }

        int resultSubtract = simpleCalculator.subtract(5, 2);

        if (resultSubtract > 0 || resultSubtract < 0 || resultSubtract == 0){
            System.out.println("test method subtract OK");
        } else {
            System.out.println("Error! method subtract");
        }
    }
}
