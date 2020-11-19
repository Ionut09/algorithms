package com.lseg.generics;

public class ExtendGenerinClasses {

//    interface Comparable<T>{
//        int compareTo(T another);
//    }

    public static void main(String... args) {
        CustomString customString = new CustomString();
        customString.compareTo("234567");

        GenericString<Integer> genericString = new GenericString<>();
        genericString.compareTo(12);
    }
}

/*
    CustomString is a Comparable<String>
    GenericString<T> is a Comparable<T> (de orice)
 */
class CustomString implements Comparable<String> {

    @Override
    public int compareTo(String o) {
        return 0;
    }
}


//T can be replaced with any type (class) at instantiation time
class GenericString<T> implements Comparable<T> {

    @Override
    public int compareTo(T o) {
        return 0;
    }
}


