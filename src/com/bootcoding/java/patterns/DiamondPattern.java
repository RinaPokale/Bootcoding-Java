package com.bootcoding.java.patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        diamond_pattern(6);
    }

    private static void diamond_pattern(int n){
    //1st half portion
        for(int i = 1; i <= n; i++){ // lines
            //spaces
            for(int j = 1; j <= (n-i); j++){
                System.out.print("-");
            }
            //stars
            for(int k = 1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

    //2nd half portion
        for(int i = n; i > 0; i--){ // lines
            //spaces
            for(int j = 1; j <= (n-i); j++){
                System.out.print("-");
            }
            //stars
            for(int k = 1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

/*
// 1st-half portion
        for(int i = 0; i < n; i++){ // lines
            // spaces
            for(int j = 0; j < (n - (i+1)); j++){
                System.out.print("-");
            }
            // stars
            for(int k = 0; k < (2*i+1); k++){
                System.out.print("*");
            }

            System.out.println(); // new line
        }

        // 2nd-half portion (inverted part)
        for(int i = (n-1); i >= 0; i--){ // lines
            // spaces
            for(int j = 0; j < (n - (i+1)); j++){
                System.out.print(" ");
            }
            // stars
            for(int k = 0; k < (2*i+1); k++){
                System.out.print("*");
            }

            System.out.println(); // new line
        }
 */
