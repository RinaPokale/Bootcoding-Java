package com.bootcoding.java.patterns;

public class TrianPattContinuousNum {

    public static void main(String[] args) {
        triangleContinuousNumPatt(4);
    }

    public static void triangleContinuousNumPatt(int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
