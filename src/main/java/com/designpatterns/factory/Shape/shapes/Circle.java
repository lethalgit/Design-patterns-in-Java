package com.designpatterns.factory.Shape.shapes;

/**
 * created by saurabhgupta on 21/12/20
 */
public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String shapeName() {
        return Circle.class.getName();
    }

    @Override
    public double calculateCircumference() {
        return 2*Math.PI*radius;
    }
}
