package com.bootcoding.java.Assignment;

/* WAP to display all numbers from 1 to 100, whose remainder will be 3
    after divided by specified number */

public class PrintDivisibleBySpecifiedNum {
        public static void printNumDivBySpecifiedNum(int n){
            for(int i = 1; i <= 100; i++){
                if(i % n == 3){
                    System.out.println(i);
                }
            }
        }
        public static void main(String[] args) {
            printNumDivBySpecifiedNum(15);
//        printNumDivBySpecifiedNum(25);
        }
}


