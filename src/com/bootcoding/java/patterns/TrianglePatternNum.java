package com.bootcoding.java.patterns;

public class TrianglePatternNum {

    public static void main(String[] args) {
        trianglePatternNum(4);
    }

    private static void trianglePatternNum(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


}
//