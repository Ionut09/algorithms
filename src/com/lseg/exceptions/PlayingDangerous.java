package com.lseg.exceptions;

public class PlayingDangerous {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");

        try {
            setGrade(student, 11);
            System.out.println("after exception thrown");
        } catch (IllegalArgumentException | ArithmeticException ex) {
            System.out.println("Exception " + ex.getClass().getSimpleName() + " with message: " + ex.getMessage());
        } finally {
            System.out.println("finally is always executed!");
        }

        System.out.println("After exception has been thrown.");
    }

    private static void setGrade(Student student, int grade) {
        student.setGrade(grade);
    }
}
