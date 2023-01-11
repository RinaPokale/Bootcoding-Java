package com.bootcoding.java.Assignment;

public class PrintDividedBySpecifiedNum {
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
