package com.kodilla.testing;
import  com.kodilla.testing.collection.OddNumbersExterminator;
// import com.kodilla.testing.calculator.Calculator;

import com.kodilla.testing.shape.Circle;
//import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Triangle;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class TestingMain {

    public static void main(String[] args){
/*
        ShapeCollector obiectShapeCollector = new ShapeCollector();
        //obiectShapeCollector;
        //obiectShapeCollector.addFigure(new Square());
        obiectShapeCollector.addFigure(new Circle("cos", 6));
        obiectShapeCollector.addFigure(new Triangle("trójkąt A", 2,5));

       // obiectShapeCollector.getShapeName("aa");
        obiectShapeCollector.getListOfShapesSize();

        //obiectShapeCollector.getFigure(0);

        //obiectShapeCollector.removeFigure(Circle());

          int liczbaPozycji = obiectShapeCollector.getListOfShapesSize();

        //obiectShapeCollector.getFigure();



        System.out.println(liczbaPozycji);
        System.out.println(obiectShapeCollector);

       // Shape addExampleShape = obiectShapeCollector.addFigure(new Circle("testowy obiekt promień", 6));
        obiectShapeCollector.addFigure(new Circle("testowy obiekt promień", 6));

        List<Shape> ccc = obiectShapeCollector.showFigures();
        //Shape fieldTriangle = ccc.get(1);
        //fieldTriangle;

        System.out.println("Cała lista " + ccc.get(1));
       // System.out.println(fieldTriangle.);

        Shape exampleShape = obiectShapeCollector.getFigure(1);
        double getExampleShape = exampleShape.getField();
        System.out.println(getExampleShape);


*/
       // figuraPobranaMetoda.;
        //System.out.println("figuraPobranaMetoda" + figuraPobranaMetoda);

        //double getExampleShape.get;

        //Shape expectedShape  = (Shape) obiectShapeCollector.addFigure(new Circle("circle one", 3));
       // expectedShape.;
        //System.out.println(obiectShapeCollector);

        // Teraz muszę utwożyć listę i dodawać obiekty do ArrayList



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
