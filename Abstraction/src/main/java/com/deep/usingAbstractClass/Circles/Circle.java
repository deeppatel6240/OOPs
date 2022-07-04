package com.deep.usingAbstractClass.Circles;
/*
 * creator Name: deepkumar.sherathiya@stl.tech
 * Date: 01/07/2022
 * Version: 1
 * Copyright: Deep Sherathiya
 */

import com.deep.usingAbstractClass.Shape;

// Sub Class of Shape class
public class Circle extends Shape {

    private final float radius;

    public Circle() {
        radius = 10.0f;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        double areaOfCircle = 0;

        areaOfCircle = MATH_PI * radius * radius;

        System.out.println("Area of Circle is: " + areaOfCircle);

        return areaOfCircle;
    }

    @Override
    public double calculatePerimeter() {

        double perimeterOfCircle = 0;

        perimeterOfCircle = MATH_PI * radius;

        System.out.println("Perimeter of Circle is: " + perimeterOfCircle);

        return perimeterOfCircle;
    }
}
