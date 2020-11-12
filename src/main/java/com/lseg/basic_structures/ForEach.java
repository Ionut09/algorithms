package com.lseg.basic_structures;

import java.util.Arrays;

public class ForEach {

    public static void main(String[] args) {
        int[] array = new int[]{20, 35, -15, 7, 55, 1, -22};

        //foreach
        for (int tempVariable : array) { //sau o colectie iterabila
            tempVariable++;
            System.out.println(tempVariable);
        }
        //--> echivalent cu
        for (int i = 0; i <= array.length-1; i++) {
            int tempVariable = array[i];
            tempVariable++;
            System.out.println(tempVariable);
            array[i]++;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(array.toString());
//        System.out.println(array.hashCode());
    }
}
