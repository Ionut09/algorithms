package com.lseg.classes;

public class Student {

    private String firstName;

    private String lastName;

    private String cnp;

    private int age;

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getCnp() {

        return cnp;
    }

    public void setCnp(String cnp) {

        if (cnp.length() != 13) {
            System.out.println("Bad cnp");
            return;
        }
        this.cnp = cnp;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}
