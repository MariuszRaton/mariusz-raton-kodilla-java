package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private double a;
    private double h;

    public Triangle(String name, double a, double h) {
        this.name = name;
        this.a = a;
        this.h = h;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        double P = 0.5 * a * h;
        return P;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", a=" + a +
                ", h=" + h +
                '}';
    }
}
