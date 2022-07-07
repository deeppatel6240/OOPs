package com.deep;

import com.deep.Shape.Shape;

public class Main {
    public static void main(String[] args) {

        // Shape1 class's object
        Shape1 shape1 = new Shape1();

        shape1.name = "121";
        shape1.height = 2.5;
        shape1.width = 7.5;
        shape1.color = "red";

        System.out.println(shape1);

        // Shape Encapsulated class's object
        Shape shape = new Shape();

         /*
          *  shape.color="yellow";
          *  'color' has private access in 'Shape', this can not be done.
          */

        shape.setColor("blue");
        shape.setName("rectangle");
        shape.setHeight(5.5);
        shape.setWidth(3.5);

        System.out.println(shape);

    }
}