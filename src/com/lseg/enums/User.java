package com.lseg.enums;

import static com.lseg.enums.Gender.MALE;

public class User {

    private String name;

    private int age;

    private Gender gender;

    public User(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {
        //create User

        User user = new User("John Doe", 30, MALE); //type safety

//        User user = new User("John Doe", 30, "mascul");
    }
}
