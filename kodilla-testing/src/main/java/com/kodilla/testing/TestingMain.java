package com.kodilla.testing;
//import  com.kodilla.testing.collection.OddNumbersExterminator;
// import com.kodilla.testing.calculator.Calculator;


import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.List;

public class TestingMain {

    public static void main(String[] args){

        OddNumbersExterminator evenNumbers = new  OddNumbersExterminator();

        List<Integer> evenList = evenNumbers.listOfNumbers();



        System.out.println(evenList);
        System.out.println(evenNumbers.exterminate((ArrayList<Integer>) evenList));

        List<Integer> evenListEmpty = evenNumbers.emptyList();
        System.out.println(evenNumbers.exterminate((ArrayList<Integer>) evenListEmpty));


/*
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
  */
    }
}
