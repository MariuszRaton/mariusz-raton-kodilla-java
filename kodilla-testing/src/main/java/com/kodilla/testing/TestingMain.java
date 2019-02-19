package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args){

        Calculator simpleCalculator = new Calculator();
        int addResult = simpleCalculator.add(200, 19);
        int subtractResult = simpleCalculator.subtract(250, 150);

        if (addResult == 219) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Add - test has error!");
        }

        if (subtractResult == 100) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Subtract - test has error!");
        }
    }
}
