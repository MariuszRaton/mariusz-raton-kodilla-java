package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name = "Square";
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        double p = a * a;
        return p;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", a = " + a +
                '}';
    }
}
