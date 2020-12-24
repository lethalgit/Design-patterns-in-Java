package com.designpatterns.factory.Shape.dtos;


import lombok.Builder;

/**
 * created by saurabhgupta on 21/12/20
 */
@Builder
public class InputDto {
    private ShapeEnum shapeEnum;
    private double radius;
    private double length;
    private double breadth;
    private double sideLength;

    public InputDto(ShapeEnum shapeEnum, double radius, double length, double breadth, double sideLength) {
        this.shapeEnum = shapeEnum;
        this.radius = radius;
        this.length = length;
        this.breadth = breadth;
        this.sideLength = sideLength;
    }

    public ShapeEnum getShapeEnum() {
        return shapeEnum;
    }

    public void setShapeEnum(ShapeEnum shapeEnum) {
        this.shapeEnum = shapeEnum;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
