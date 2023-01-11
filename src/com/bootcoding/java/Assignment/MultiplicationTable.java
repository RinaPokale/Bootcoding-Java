package com.bootcoding.java.Assignment;

public class MultiplicationTable {
    public static void multiplicationTable(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }

    public static void main(String[] args) {
        multiplicationTable(8);
    }
}
