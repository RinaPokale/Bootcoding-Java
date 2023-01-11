package com.bootcoding.java.Assignment;

import java.util.Scanner;

public class MonthOfYear {
    public static void printMonthOfYear(int n){
        switch (n){
            case 1:
                System.out.println("January");
            break;

            case 2:
                System.out.println("February");
            break;

            case 3:
                System.out.println("March");
            break;

            case 4:
                System.out.println("April");
            break;

            case 5:
                System.out.println("May");
            break;

            case 6:
                System.out.println("Jun");
            break;

            case 7:
                System.out.println("July");
            break;

            case 8:
                System.out.println("August");
            break;

            case 9:
                System.out.println("September");
            break;

            case 10:
                System.out.println("October");
            break;

            case 11:
                System.out.println("November");
            break;

            case 12:
                System.out.println("December");
            break;

            default:
                System.out.println("December");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number between 1 to 12 to get the month number:- ");
        int n = sc.nextInt();
        printMonthOfYear(n);

    }
}
