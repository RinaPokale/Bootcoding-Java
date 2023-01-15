package com.bootcoding.java.scanner;

import java.util.Scanner;

public class PrintSquareOfEachEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:- ");
        int size = sc.nextInt();

        int[] num = new int[size];

        for(int i = 0; i < num.length; i++){
            System.out.println("Enter number " + (i+1));
            num[i] = sc.nextInt();
        }

        int[] squareOfEle = returnSquareOfArrayEle(num);
        for(int i = 0; i < squareOfEle.length; i++){
            System.out.println("Square of " + num[i]  + " = " +squareOfEle[i]);
        }
    }

    private static int[] returnSquareOfArrayEle(int[] num){
        int[] squareOfEle = new int[num.length];

        for(int i = 0; i < num.length; i++){
            squareOfEle[i]  = num[i] * num[i];
        }

        return squareOfEle;
    }
}
