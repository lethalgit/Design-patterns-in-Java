package com.designpatterns.factory.Shape;

/**
 * created by saurabhgupta on 21/12/20
 */
public class Hexagon extends Shape{
    double sideLength;

    public Hexagon(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return (3*Math.sqrt(3)*sideLength*sideLength)/2;
    }

    @Override
    String shapeName() {
        return Hexagon.class.getName();
    }

    @Override
    double calculateCircumference() {
        return 6*sideLength;
    }
}
