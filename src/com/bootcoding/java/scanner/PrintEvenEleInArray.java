package com.bootcoding.java.scanner;

import java.util.Scanner;

public class PrintEvenEleInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array:- ");
        int size = sc.nextInt();
        int num[] = new int[size];

        for(int i = 0; i < num.length; i++){
            System.out.println("Enter number " + (i+1));
            num[i]  = sc.nextInt();
        }

        int[] evenArray = printEvenArrayEle(num);
        System.out.println("Even elements from an array:- ");

        for(int i = 0; i < evenArray.length; i++){
            System.out.println(evenArray[i]);
        }
    }

    private static int[] printEvenArrayEle(int[] num){
        int count = countEvenArrayEle(num);
        int[] evenArray = new int[count];
        int indx = 0;

        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                evenArray[indx++]  = num[i];
            }
        }

        return evenArray;
    }

    private static int countEvenArrayEle(int[] num){
        int count = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
