package com.lseg.collections;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        int compareByName = s1.getName().compareTo(s2.getName());

        if (compareByName == 0) {
            return Integer.compare(s1.getAge(), s2.getAge()) * (-1);
        }

        return compareByName;
    }
}
