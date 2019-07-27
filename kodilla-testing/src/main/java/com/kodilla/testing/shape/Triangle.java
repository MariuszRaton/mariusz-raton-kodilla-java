package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name = "Triangle";
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        double p = 0.5 * a * h;
        return p;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", a = " + a +
                ", h = " + h +
                '}';
    }
}
