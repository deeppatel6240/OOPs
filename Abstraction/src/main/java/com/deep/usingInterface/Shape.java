package com.deep.usingInterface;
/*
 * creator Name: deepkumar.sherathiya@stl.tech
 * Date: 04/07/2022
 * Version: 1
 * Copyright: Deep Sherathiya
 */

// interface to achieve abstraction
public interface Shape {

    double MATH_PI = 3.14;

    // public abstract will be injected by default
    double calculateArea();

    // public abstract will be injected by default
    double calculatePerimeter();
}
