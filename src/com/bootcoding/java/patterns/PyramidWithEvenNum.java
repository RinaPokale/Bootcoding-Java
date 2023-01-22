package com.bootcoding.java.patterns;

public class PyramidWithEvenNum {

    public static void main(String[] args) {
        printEvenNum(4);
    }

    private static void printEvenNum(int n){
        int num = 1;
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            //pattern
            for(int k = 1; k <=i; k++){
                System.out.print(2*num + " ");
                num++;
            }
            System.out.println();
        }
    }



}
