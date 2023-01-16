package com.bootcoding.java.patterns;

public class PyramidWithNumbers {
    public static void main(String[] args) {
        printPyramidWithNums(4);
    }

    private static void printPyramidWithNums(int n){
        int count = 1;

        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            //numbers
            for(int k = 1; k<=i; k++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
