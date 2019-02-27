package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private Shape shape;
    private List<Shape> listOfShapes = new ArrayList<Shape>();

    public Shape addFigure(Shape shape){
        listOfShapes.add(shape);
        return shape;
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (listOfShapes.contains(shape)){
            System.out.println("Usunięty kształt to: " + shape);
            listOfShapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        return  listOfShapes.get(n);
    }

    public int getListOfShapesSize() {
        return listOfShapes.size();
    }

    public List showFigures(){
        for (Shape i :listOfShapes) {
            System.out.println(i);
        }
        return listOfShapes;
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "shape Class = " + shape +
                '}';
    }
}
