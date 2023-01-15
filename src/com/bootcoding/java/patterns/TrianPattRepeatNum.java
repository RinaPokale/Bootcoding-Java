package com.bootcoding.java.patterns;

public class TrianPattRepeatNum {
    public static void main(String[] args) {
        trianglePatternRepeatNum(4);
        System.out.println();
        trianglePatternRepeatNum(6);
    }

    private static void trianglePatternRepeatNum(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


}
