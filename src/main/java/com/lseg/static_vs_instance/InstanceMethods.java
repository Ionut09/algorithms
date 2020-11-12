package com.lseg.static_vs_instance;

import java.util.List;

public class InstanceMethods {

    public static void main(String[] args) {
        TestClass testSuite = new TestClass();
        testSuite.test1();

        testSuite = new TestClass();
        testSuite.test2();
    }
}

class TestClass {

    private List<String> list;

    public TestClass() {
        super();
    }

    public void test1() {

        list.add("something");
        System.out.println("woof");
    }

    public void test2() {
        list.add("something2");
        System.out.println("woof");
    }
}
