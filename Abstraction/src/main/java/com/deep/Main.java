package com.deep;
/*
 * creator Name: deepkumar.sherathiya@stl.tech
 * Date: 21/07/2022
 * Version: 1
 * Copyright: Deep Sherathiya
 */

import com.deep.usingAbstractClass.Circles.Circle;
import com.deep.usingAbstractClass.ComparisonEngine.ShapeAreaPerimeterComparisonEngine;
import com.deep.usingAbstractClass.Rectangles.Rectangle;
import com.deep.usingAbstractClass.Shape;
import com.deep.usingAbstractClass.Squares.Square;
import com.deep.usingInterface.ShapeFactory.ShapeFactoryDesign;

// main class of module
public class Main {

    public static void shapeComparisonByPassingAbstractClassMethod() {
        Shape shape1 = new Circle(2.0f);
        Shape shape2 = new Rectangle(4.0f, 10f);

        ShapeAreaPerimeterComparisonEngine.compareAreaOfShape(shape1, shape2);
        ShapeAreaPerimeterComparisonEngine.comparePerimeterOfShape(shape1, shape2);
    }

    public static void shapeComparisonByPassingInterfaceMethod() {
        com.deep.usingInterface.Shape shape1 = new com.deep.usingInterface.Circles.Circle(2.0f);
        com.deep.usingInterface.Shape shape2 = new com.deep.usingInterface.Rectangles.Rectangle(4.0f, 10f);

        com.deep.usingInterface.ComparisonEngine.ShapeAreaPerimeterComparisonEngine.compareAreaOfShape(shape1, shape2);
        com.deep.usingInterface.ComparisonEngine.ShapeAreaPerimeterComparisonEngine.comparePerimeterOfShape(shape1, shape2);
    }

    public static void main(String[] args) {

        // Using Abstract class for achieving abstraction
        Shape shape;

        // Creating Object of Circle
        shape = new Circle(1.0f);

        shape.calculateArea();
        shape.calculatePerimeter();

        // Creating Object of Rectangle
        shape = new Rectangle(2.0f, 4.0f);

        shape.calculateArea();
        shape.calculatePerimeter();

        // Creating Object of Square
        shape = new Square(5.0f);

        shape.calculateArea();
        shape.calculatePerimeter();

        System.out.println("Comparing two shapes using another utility");
        shapeComparisonByPassingAbstractClassMethod();

        // Using Interface for achieving abstraction
        com.deep.usingInterface.Shape shape1;

        // Creating Object of Circle
        shape1 = ShapeFactoryDesign.getShape("Circle");

        shape1.calculateArea();
        shape1.calculatePerimeter();

        // Creating Object of Rectangle
        shape1 = ShapeFactoryDesign.getShape("Rectangle");

        shape1.calculateArea();
        shape1.calculatePerimeter();

        // Creating Object of Square
        shape1 = ShapeFactoryDesign.getShape("Square");
        shape1.calculateArea();
        shape1.calculatePerimeter();

        System.out.println("Comparing two shapes using another utility");
        shapeComparisonByPassingInterfaceMethod();

    }
}