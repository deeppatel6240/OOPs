package com.deep.Shape;
/*
 * creator Name: deepkumar.sherathiya@stl.tech
 * Date: 21/07/2022
 * Version: 1
 * Copyright: Deep Sherathiya
 */
public class Shape {

    private String name;
    private double height;
    private double width;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}
