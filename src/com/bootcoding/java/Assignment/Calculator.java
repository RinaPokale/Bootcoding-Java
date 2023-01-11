package com.bootcoding.java.Assignment;

public class Calculator {
    public static int addition(int n1, int n2){
        return n1 + n2;
    }

    public static int multiplication(int n1, int n2){
        return n1 * n2;
    }

    public static int subtraction(int n1, int n2){
        return n1 - n2;
    }

    public static int division(int n1, int n2){
        return n1 / n2;
    }

    public static int remainder(int n1, int n2){
        return n1 % n2;
    }
    public static void main(String[] args) {
        int n1 = 125, n2 = 24;
        System.out.println(n1 + " + "  + n2 + " = " +addition(n1, n2));
        System.out.println(n1 + " * " + n2 + " = " +multiplication(n1, n2));
        System.out.println(n1 + " - " + n2 + " = " +subtraction(n1, n2));
        System.out.println(n1 + " / " + n2 + " = " +division(n1, n2));
        System.out.println(n1 + " % " + n2 + " = " +remainder(n1, n2));
    }
}
