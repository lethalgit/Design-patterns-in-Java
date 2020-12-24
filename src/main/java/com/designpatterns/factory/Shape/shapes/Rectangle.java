package com.designpatterns.factory.Shape.shapes;

/**
 * created by saurabhgupta on 21/12/20
 */
public class Rectangle extends Shape{
    double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }

    @Override
    public String shapeName() {
        return Rectangle.class.getName();
    }

    @Override
    public double calculateCircumference() {
        return 2*length*breadth;
    }
}
