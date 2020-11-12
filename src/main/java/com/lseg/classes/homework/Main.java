package com.lseg.classes.homework;

public class Main {

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1, 1);
        one.add(2, 3);
        System.out.println(one.getReal() + " + " + one.getImaginary() + "i");

        ComplexNumber two = new ComplexNumber(2, 2);
        //3.0 + 4.0i
        one.add(two); //pasam referinta
        System.out.println(one.getReal() + " + " + one.getImaginary() + "i");

    }
}
