package com.kodilla.spring70.shape;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
    @Override
    public String getShapeName() {
        return "This is a circle.";
    }
}
