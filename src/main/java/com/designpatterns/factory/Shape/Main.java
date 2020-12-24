package com.designpatterns.factory.Shape;

import com.designpatterns.factory.Shape.dtos.InputDto;
import com.designpatterns.factory.Shape.dtos.ShapeEnum;
import com.designpatterns.factory.Shape.shapes.Shape;

/**
 * created by saurabhgupta on 21/12/20
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        InputDto inputDto = new InputDto(ShapeEnum.HEXAGON, 0, 0, 0, 5.4);
        Shape shape = shapeFactory.getShape(ShapeEnum.HEXAGON, inputDto);
        System.out.println(shape.shapeName());
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculateCircumference());
    }
}
