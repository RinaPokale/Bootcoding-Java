package com.bootcoding.java.scanner;

import java.util.Scanner;

public class PrintDuplicateNumsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array:- ");
        int size = sc.nextInt();

        int num[] = new int[size];

        for(int i = 0; i < num.length; i++){
            System.out.println("Enter number " + (i+1));
            num[i] = sc.nextInt();
        }

        int[] duplicateArrayEle = returnDuplicateEle(num);

        System.out.println("Duplicate array elements:- ");
        for(int i = 0; i < duplicateArrayEle.length; i++){
            System.out.println(duplicateArrayEle[i]);
        }
    }

    private static int[] returnDuplicateEle(int[] num){
        int count = countDuplicateEle(num);
        int[] duplicateArrayEle = new int[count];
        int indx = 0;

        for(int i = 0; i < num.length; i++){
            for(int  j = i+1; j < num.length; j++){
                if(num[i] == num[j]){
                    duplicateArrayEle[indx++] = num[i];
                }
            }
        }
        return duplicateArrayEle;
    }

    private static int countDuplicateEle(int[] num){
        int count = 0;

        for(int i = 0; i < num.length; i++){
            for(int j = i+1; j < num.length; j++){
                if(num[i] == num[j]){
                    count++;
                }
            }
        }
        return count;

    }
}
