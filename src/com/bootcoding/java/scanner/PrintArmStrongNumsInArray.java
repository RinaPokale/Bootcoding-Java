package com.bootcoding.java.scanner;

import java.util.Scanner;

public class PrintArmStrongNumsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array:- ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int i = 0; i < nums.length; i++){
            System.out.println("Enter number " +(i+1));
            nums[i] = sc.nextInt();
        }

        int[] armStrongArr = returnArmStrongNum(nums);

        System.out.println("\nArmstrong numbers:- ");
        for(int i = 0; i < armStrongArr.length; i++){
            System.out.println(armStrongArr[i]);
        }
    }

    private static int[] returnArmStrongNum(int[] nums){
        int[] copyArr = nums.clone();
        int sizeOfArmStrong = returnSizeOfArmStrongArr(copyArr);
        int[] armStrongArr = new int[sizeOfArmStrong];
        int indx = 0;

        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int count = countLengthOfNum(nums[i]); // find length of number
            int sum = 0;
            while (nums[i] > 0){
                int lst = nums[i] % 10;
                sum += Math.pow(lst, count);
                nums[i] /= 10;
                lst = 0;
            }

            if(n == sum){
                armStrongArr[indx++] = n;
            }
        }
        return armStrongArr;
    }

    private static int returnSizeOfArmStrongArr(int[] copyArr) {
        int size = 0;

        for(int i = 0; i < copyArr.length; i++){
            int n = copyArr[i];
            int count = countLengthOfNum(copyArr[i]); // find length of number
            int sum = 0;
            while (copyArr[i] > 0){
                int lst = copyArr[i] % 10;
                sum += Math.pow(lst, count);
                copyArr[i] /= 10;
                lst = 0;
            }

            if(n == sum){
                size++;
            }
        }
        return size;
    }

    private static int countLengthOfNum(int n){
        int count = 0;

        while (n > 0){
            n/=10;
            count++;
        }
        return count;
    }
}
