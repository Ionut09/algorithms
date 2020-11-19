package com.lseg.generics.methods;

import java.util.List;

public class Util {

    public static void main(String... args) {
        var s = "str";
        List<Number> list1 = List.of(1, 2, 3);
        printListOnDifferentLines1(list1);
        Util.<String>printListOnDifferentLines(List.of("1", "2", "3"));
        //sunt echivalente datorita type inference = deducerea tipului variabilei
        Util.printListOnDifferentLines(List.of("1", "2", "3"));

        List<Integer> list = List.of(1, 2, 3);
//       printListOnDifferentLines1(list); //does not compile

        //nu pot sa dau List<Integer> in loc de List<Number>
    }

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey())
                && p1.getValue().equals(p2.getValue());
    }

    public static <T> void printListOnDifferentLines(List<T> list) {
//        list.forEach((T element) -> System.out.println(element));
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static void printListOnDifferentLines1(List<Number> list) {
        for (Number element : list) {
            list.add(2.5);
            list.add(2.5f);
            System.out.println(element);
        }
    }

    public static <T extends Number> void sum(List<T> list) {
        double sum = 0;
        for (T element : list) {
            sum += element.doubleValue();
        }
//        T t = new T();
//        T[] t1 = new T[0];
    }


}

class Pair<K, V> {

    private K key;

    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
