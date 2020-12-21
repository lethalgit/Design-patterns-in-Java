package com.designpatterns.factory.Shape;

/**
 * created by saurabhgupta on 21/12/20
 */
public class ShapeFactory {
    public Shape getShape(ShapeEnum shapeEnum, InputDto inputDto) {
        switch (shapeEnum) {
            case CIRCLE:
                return new Circle(inputDto.getRadius());
            case HEXAGON:
                return new Hexagon(inputDto.getSideLength());
            case RECTANGLE:
                return new Rectangle(inputDto.getLength(), inputDto.getBreadth());
        }
        return null;
    }
}
