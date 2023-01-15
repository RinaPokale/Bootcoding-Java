package com.bootcoding.java.patterns;

public class TrianglePatternStar {
    public static void main(String[] args) {
        trianglePatternStar(5);
    }

    public static void trianglePatternStar(int n){
        for(int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


}
