package com.deep.usingInterface.ShapeFactory;

import com.deep.usingInterface.Circles.Circle;
import com.deep.usingInterface.Rectangles.Rectangle;
import com.deep.usingInterface.Shape;
import com.deep.usingInterface.Squares.Square;

/*
 * creator Name: deepkumar.sherathiya@stl.tech
 * Date: 04/07/2022
 * Version: 1
 * Copyright: Deep Sherathiya
 */
public class ShapeFactoryDesign {

    public static Shape getShape(String shape) {
        if (shape == null) {
            return null;
        } else if ("Circle".equals(shape)) {
            return new Circle(3.0f);
        } else if ("Rectangle".equals(shape)) {
            return new Rectangle(10f, 10f);
        } else if ("Square".equals(shape)) {
            return new Square(5f);
        } else {
            return null;
        }
    }
}
