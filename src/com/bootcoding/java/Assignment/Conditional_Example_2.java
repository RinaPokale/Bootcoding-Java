package com.bootcoding.java.Assignment;

import java.util.Scanner;

public class Conditional_Example_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Employee ID(Max. 10 chars):- ");
        int emp_Id = sc.nextInt();

        System.out.println("Enter the working hours:- ");
        int workingHrs = sc.nextInt();

        System.out.println("Enter the Salary (amount) per hour:- ");
        double perHrSalary = sc.nextDouble();

        printEmployeesDetails(emp_Id, workingHrs, perHrSalary);

    }

    private static void printEmployeesDetails(int emp_Id, int workingHrs, double perHrSalary){
        System.out.println("Employee ID:- " + emp_Id);
        System.out.println("Salary:- " +"U$ "+ String.format("%.2f", (workingHrs * perHrSalary)));
    }
}
