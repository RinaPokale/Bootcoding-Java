package com.bootcoding.java.oops.assignment.discount;

import java.util.Random;

public class OrderCountGenerator {

    private final static int MAX = 100;
    private final static int MIN = 1;
    private final static Random random = new Random();

    public static int getOrderCount() {
       return MIN + random.nextInt(MAX - MIN);
    }
}
