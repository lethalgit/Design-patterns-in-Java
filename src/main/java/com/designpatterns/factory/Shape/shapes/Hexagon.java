package com.designpatterns.factory.Shape.shapes;

/**
 * created by saurabhgupta on 21/12/20
 */
public class Hexagon extends Shape{
    double sideLength;

    public Hexagon(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return (3*Math.sqrt(3)*sideLength*sideLength)/2;
    }

    @Override
    public String shapeName() {
        return Hexagon.class.getName();
    }

    @Override
    public double calculateCircumference() {
        return 6*sideLength;
    }
}
