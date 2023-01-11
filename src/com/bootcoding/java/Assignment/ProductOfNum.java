package com.bootcoding.java.Assignment;

public class ProductOfNum {
    public static int productOfTwoNum(int n1, int n2){
        return n1 * n2;
    }

    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 34;
        System.out.println(n1 + " * " + n2 + " = " +productOfTwoNum(12, 34));
    }
}
