package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name;
    private double a;

    public Square(String name, double a) {
        this.name = name;
        this.a = a;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        double P = a * a;
        return P;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", a=" + a +
                '}';
    }
}
