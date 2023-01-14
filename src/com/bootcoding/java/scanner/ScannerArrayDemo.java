package com.bootcoding.java.scanner;

import java.util.Scanner;

public class ScannerArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Size pf an array:- ");
        int size = sc.nextInt();
        int[] num = new int[size];

        for(int i = 0; i < num.length; i ++){
            System.out.println("Enter number " + (i+1));
            num[i] = sc.nextInt();
        }

        int minVal = minValue(num);
        System.out.println("Min value in array is " + minVal);

        int maxVal = maxValue(num);
        System.out.println("Max value in array is " +maxVal);


    }

    private static int minValue(int[] num){
        int minVal = num[0];

        for(int i = 1; i < num.length; i++){
            if(num[i] < minVal){
                minVal = num[i];
            }

        }
        return minVal;
    }

    private static int maxValue(int[] num){
        int maxVal = num[0];

        for(int i = 1; i < num.length; i++){
            if(num[i] > maxVal){
                maxVal = num[i];
            }
        }
        return maxVal;
    }
}

// 5 8 9 3 10 50
/*
printEven
printOdd
printMinElement
printMaxElement
printPalindrome
printArmstrong
printPrimeNumber
printDuplicateNumber
printSquareOfEachElement

 */