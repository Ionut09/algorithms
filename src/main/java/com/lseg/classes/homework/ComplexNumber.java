package com.lseg.classes.homework;

public class ComplexNumber {

    private double real;

    private double imaginary;

    public ComplexNumber() {
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real; //this e acelasi cu one
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber number) {
//        this.real += number.getReal();
//        this.imaginary += number.getImaginary();
        add(number.getReal(), number.getImaginary());
    }
}
