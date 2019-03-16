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
        double pi = 3.1415;
        double p = pi * (r * r);
        return p;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", r = " + r +
                '}';
    }
}
