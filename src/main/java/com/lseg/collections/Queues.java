package com.lseg.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String... args) {
        //creating a queue
        Queue<Integer> nums = new LinkedList<>(); //FIFO
        //elementele sunt introduse pe la un capat (tail) si retrieved from another (head)

        nums.offer(5);
        nums.offer(8);
        nums.offer(4);
        nums.add(6);
        System.out.println(nums); //[5, 8, 4, 6]

        System.out.println("remove = " + nums.remove()); //5
        System.out.println(nums); //[8, 4, 6]

        System.out.println("element = " + nums.element()); //8
        System.out.println(nums); //[8, 4, 6]

        System.out.println("peek = " + nums.peek()); //8
        System.out.println(nums); //[8, 4, 6]

        System.out.println("poll = " + nums.poll()); //8 --> O(1)
        System.out.println(nums); //[4, 6]



    }
}
