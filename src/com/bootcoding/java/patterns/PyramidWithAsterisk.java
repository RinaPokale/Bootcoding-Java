package com.bootcoding.java.patterns;

public class PyramidWithAsterisk {
    public static void main(String[] args) {
        printPyramidWithAsterisk(5);
    }
    private static void printPyramidWithAsterisk(int n){
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            //stars
            for (int k = 1; k <= i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
