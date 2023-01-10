package com.bootcoding.java.patterns;

public class TrainPattRepeatNum {

    public static void trainglePatternRepeatNum(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        trainglePatternRepeatNum(4);
        System.out.println();
        trainglePatternRepeatNum(6);

    }
}
