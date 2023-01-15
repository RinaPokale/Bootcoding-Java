package com.bootcoding.java.scanner;

import java.util.Scanner;

public class PrintPrimeNumsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array:- ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        for(int i = 0; i < nums.length; i++){
            System.out.println("Enter number " + (i+1));
            nums[i] = sc.nextInt();
        }

        printPrimeNum(nums);

    /*  int[] primeNumsArray = returnPrimeNums(nums);
        printPrimeNum(primeNumsArray);  */

    }

    private static int[] returnPrimeNums(int[] nums){
        int size = countSizeOfPrimeNum(nums);
        int[] primeNumsArray = new int[size];
        boolean isPrime = true; // initially considering num is prime
        int indx = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= 1) {
                isPrime = false;
            }
            else{
                for(int j = 2; j <= Math.sqrt(nums[i]); j++){
                    if(nums[i] % j == 0){
                        isPrime = false; // num is not prime
                    }
                }
            }

            if(isPrime) // isPrime == true
                primeNumsArray[indx++] = nums[i];

            isPrime = true;

        }
        return primeNumsArray;
    }

    private static int countSizeOfPrimeNum(int[] nums){
        boolean isPrime = true; // initially considering num is prime
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= 1) {
                isPrime = false;
            }
            else{
                for(int j = 2; j <= Math.sqrt(nums[i]); j++){
                    if(nums[i] % j == 0){
                        isPrime = false; // num is not prime
                    }
                }
            }

            if(isPrime) // isPrime == true
                count++;

            isPrime = true;

        }
        return count;

    }

    private static void printPrimeNum(int[] nums){
        int[] primeNumsArray = returnPrimeNums(nums);

        System.out.println("Prime Numbers:- ");
        for(int i = 0; i < primeNumsArray.length; i++){
            System.out.println(primeNumsArray[i]);
        }
    }
}
