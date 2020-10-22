package com.lseg.exceptions;

import static java.lang.Math.PI;

public class Circle {

    public static double area(double radius) throws Exception {
        if (radius < 0) {
            throw new Exception("Radius should be positive.");
        }
        return PI * radius * radius;

    }

}
