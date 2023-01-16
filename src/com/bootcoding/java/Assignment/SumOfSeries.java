package com.bootcoding.java.Assignment;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println("\nThe Sum is " + findSumOfSeries(5));
    }

    private static int findSumOfSeries(int n){
        int sum = 0, series = 0;

        for(int i = 1; i <= n; i++){
            series = (series * 10) + 1;
            sum += series;
            System.out.print(series + " + ");
        }

        return sum;
    }
}
