package com.bootcoding.java.Assignment;

import java.util.Scanner;

public class Conditional_Example_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Positive Number:- ");
        int p = sc.nextInt();

        System.out.println("Enter Second Positive Number:- ");
        int q = sc.nextInt();

        System.out.println("Enter Third Positive Number:- ");
        int r = sc.nextInt();

        System.out.println("Enter Fourth Even Number:- ");
        int s = sc.nextInt();

        checkValues(p, q, r, s);

    }

    private static void checkValues(int p, int q, int r, int s){
        if((q > r) && (s > p) && (r+s) > (p+q)){
            System.out.println("Correct values");
        }
        else {
            System.out.println("Wrong values");
        }

    }
}
