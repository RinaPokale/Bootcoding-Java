package com.bootcoding.java.scanner;

import java.util.Scanner;

public class PrintPalindromeNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:- ");
        int size = sc.nextInt();
        int num[] = new int[size];

        for(int i = 0; i < num.length; i++){
            System.out.println("Enter number " + (i+1));
            num[i]  = sc.nextInt();
        }

        int[] palindromeNum = returnPalindromeNum(num);

        System.out.println("Palindrome Elements:- ");
        for(int i = 0; i < palindromeNum.length; i++){
            System.out.println(palindromeNum[i]);
        }
    }

    private static int[] returnPalindromeNum(int[] num){
        int[] numberCopy = num.clone(); // copying array elements
        int count = countPalindromeNum(numberCopy);
        int[] palindromeNum = new int[count];

        int rev = 0;
        int indx = 0;

        for(int i = 0 ; i < num.length; i++){
            int ele = num[i];

            while (num[i] > 0){
                rev = (rev * 10) + num[i] % 10;
                num[i] /= 10;
            }

            if (ele == rev){
                palindromeNum[indx] = ele;
                indx++;
            }

            rev = 0;
        }
        return palindromeNum;
    }

    private static int countPalindromeNum(int[] numberCopy){
        int count = 0;
        int rev = 0;

        for(int i = 0; i < numberCopy.length; i++){
            int ele = numberCopy[i];

            while(numberCopy[i] > 0){
                rev = (rev * 10) + numberCopy[i] % 10;
                numberCopy[i] /= 10;
            }

            if(ele == rev){
                count++;
            }
            rev = 0;
        }

        return count;
    }
}
