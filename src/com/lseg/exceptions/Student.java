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

    public void setGrade(int grade) throws StudentGradeValidationException {
        if (grade < 1 || grade > 10) {
            throw new StudentGradeValidationException("Student grade should be between 1 and 10.");
        }

        //grade calculation
        grade = grade / 0;
        this.grade = grade;
    }
}
