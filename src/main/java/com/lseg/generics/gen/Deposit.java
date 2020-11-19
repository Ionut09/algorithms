package com.lseg.generics.gen;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deposit {

    public static void main(String... args) {

        Box<String> box = new Box<String>();

        box.setContent("str");
        String content = box.getContent();

        System.out.println("content = " + content);

        Box<ArrayList<String>> box1 = new Box<>();
        box1.setContent(new ArrayList<>());

        Box<Box<Box<Box<String>>>> multipleBox = new Box<>();

        Map<String, List<String>> multivalueMap = new HashMap<>();
        multivalueMap.put("Accept", List.of("application/json", "application/xml", "multipart/part"));
    }
}
