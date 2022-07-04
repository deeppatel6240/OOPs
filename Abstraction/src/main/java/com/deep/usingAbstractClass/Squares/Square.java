package com.deep.usingAbstractClass.Squares;
/*
 * creator Name: deepkumar.sherathiya@stl.tech
 * Date: 02/07/2022
 * Version: 1
 * Copyright: Deep Sherathiya
 */


import com.deep.usingAbstractClass.Shape;

public class Square extends Shape {

    private final float lengthOfSide;

    public Square() {
        lengthOfSide = 4.0f;
    }

    public Square(float lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }


    @Override
    public double calculateArea() {
        double areaOfSquare = 0;

        areaOfSquare = lengthOfSide * lengthOfSide;

        System.out.println("Area of Rectangle is: " + areaOfSquare);

        return areaOfSquare;
    }

    @Override
    public double calculatePerimeter() {
        double perimeterOfSquare = 0;

        perimeterOfSquare = 4 * lengthOfSide;

        System.out.println("Perimeter of Rectangle is: " + perimeterOfSquare);

        return perimeterOfSquare;
    }
}
