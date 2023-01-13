package com.bootcoding.java.scanner;

import java.util.Scanner;

public class PrintOddEleInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array:- ");
        int size = sc.nextInt();
        int num[] = new int[size];

        for(int i = 0; i < num.length; i++){
            System.out.println("Enter number " + (i+1));
            num[i]  = sc.nextInt();
        }

        int[] oddArray = printOddArrayEle(num);
        System.out.println("Odd elements in an array:- ");

        for(int i = 0; i < oddArray.length; i++){
            System.out.println(oddArray[i]);
        }
    }

    private static int[] printOddArrayEle(int[] num){
        int count = countOddArrayEle(num);
        int[] oddArray = new int[count];
        int indx = 0;

        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 1){
                oddArray[indx++]  = num[i];
            }
        }

        return oddArray;
    }

    private static int countOddArrayEle(int[] num){
        int count = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 1){
                count++;
            }
        }
        return count;
    }
}
