package com.bootcoding.java.scanner;

import java.util.Scanner;

public class ScannerIntDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:- ");
        int num = sc.nextInt();

        boolean res = isEven(num);

        if(res){
            System.out.println(num + " is Even Number ");
        }
        else{
            System.out.println(num + " is Odd Number");
        }

    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
