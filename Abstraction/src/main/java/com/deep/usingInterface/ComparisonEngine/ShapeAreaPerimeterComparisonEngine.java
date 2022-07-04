package com.deep.usingInterface.ComparisonEngine;
/*
 * creator Name: deepkumar.sherathiya@stl.tech
 * Date: 04/07/2022
 * Version: 1
 * Copyright: Deep Sherathiya
 */
import com.deep.usingInterface.Shape;

public class ShapeAreaPerimeterComparisonEngine {

    public static void compareAreaOfShape(Shape shape1, Shape shape2) {

        double areaOfShape1 = shape1.calculateArea();
        double areaOfShape2 = shape2.calculateArea();

        System.out.println("Area of shape1 is: " + areaOfShape1 + " and Area of shape2 is: " + areaOfShape2);

    }

    public static void comparePerimeterOfShape(Shape shape1, Shape shape2) {

        double perimeterOfShape1 = shape1.calculatePerimeter();
        double perimeterOfShape2 = shape2.calculatePerimeter();

        System.out.println("Perimeter of shape1 is: " + perimeterOfShape1 + " and Perimeter of shape2 is: " + perimeterOfShape2);

    }
}
