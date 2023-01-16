package com.bootcoding.java.Assignment;

public class HarmonicSeriesSum {

    public static void main(String[] args) {
        HarmonicSeriesSum seriesSum = new HarmonicSeriesSum();
        double res = seriesSum.printHarmonicSeriesSum(5);

        System.out.println("\nThe Sum of Series:- " + String.format("%.6f", res));
    }

    public double printHarmonicSeriesSum(int n){
        double sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.print(1 + "/" +i);
            if(i != n)
                System.out.print(" + ");

            sum += 1/(double)i;
        }
        return sum;
    }


}
