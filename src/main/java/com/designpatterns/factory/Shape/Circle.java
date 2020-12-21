package com.designpatterns.factory.Shape;

/**
 * created by saurabhgupta on 21/12/20
 */
public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    String shapeName() {
        return Circle.class.getName();
    }

    @Override
    double calculateCircumference() {
        return 2*Math.PI*radius;
    }
}
