package com.deep.usingAbstractClass.Rectangles;
/*
 * creator Name: deepkumar.sherathiya@stl.tech
 * Date: 02/07/2022
 * Version: 1
 * Copyright: Deep Sherathiya
 */

import com.deep.usingAbstractClass.Shape;

// Sub Class of Shape class
public class Rectangle extends Shape {

    private final float length;
    private final float width;

    public Rectangle() {
        length = 2.0f;
        width = 3.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double areaOfRectangle = 0;

        areaOfRectangle = length * width;

        System.out.println("Area of Rectangle is: " + areaOfRectangle);

        return areaOfRectangle;
    }

    @Override
    public double calculatePerimeter() {
        double perimeterOfRectangle = 0;

        perimeterOfRectangle = 2 * (length + width);

        System.out.println("Perimeter of Rectangle is: " + perimeterOfRectangle);

        return perimeterOfRectangle;
    }
}
