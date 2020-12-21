package com.designpatterns.factory.Shape;

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
    double calculateArea() {
        return length*breadth;
    }

    @Override
    String shapeName() {
        return Rectangle.class.getName();
    }

    @Override
    double calculateCircumference() {
        return 2*length*breadth;
    }
}
