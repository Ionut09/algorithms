package com.lseg.exceptions;

public class Student {

    private String name;

    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 1 || grade > 10) {
            RuntimeException exception = new RuntimeException("Student grade should be between 1 and 10.");
            throw exception;
        }

        //grade calculation
        grade = grade / 0;
        this.grade = grade;
    }
}
