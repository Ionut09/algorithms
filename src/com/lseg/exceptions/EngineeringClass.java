package com.lseg.exceptions;

public class EngineeringClass {

    public static void main(String[] args) {

        double area = 0;
        double radius = -110;
        try {
            area = Circle.area(radius);
        } catch (Exception e) {
            //niciodata nu lasam catch gol
            //swallowed
//            e.printStackTrace();
            System.out.println("Exception while calculating area: " + radius);
        }
        System.out.println("area = " + area); //NaN
    }
}
