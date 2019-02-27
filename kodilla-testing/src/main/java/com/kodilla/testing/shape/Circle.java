package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    private double r;

    public Circle(String name, double r) {
        this.name = name;
        this.r = r;
    }

    public String getShapeName(){//getShapeName(String name){
       return name;
    }

    public double getField(){
        double PI = 3.1415;
        double P = PI * (r * r);
        return P;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", r=" + r +
                '}';
    }
}
