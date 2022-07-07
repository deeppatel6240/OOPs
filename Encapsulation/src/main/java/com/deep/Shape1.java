package com.deep;

public class Shape1 {
    String name;
    double height;
    double width;
    String color;

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
