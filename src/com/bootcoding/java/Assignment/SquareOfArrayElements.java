package com.bootcoding.java.Assignment;

//Wap to return Square of array elements using method

public class SquareOfArrayElements {
    public int[] squareOfArrayElements(int[] nums){
        int[] SquareOfNum = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            SquareOfNum[i] = nums[i] * nums[i];
        }
        return SquareOfNum;
    }

    public static void main(String[] args) {
        SquareOfArrayElements sq = new SquareOfArrayElements();

        int[] nums = {1, 2, 3, 4, 5};
        int[] sqNum = sq.squareOfArrayElements(nums);

        for(int i = 0; i < sqNum.length; i++){
            System.out.println("Square of " + nums[i] + " = " +sqNum[i]);
        }
    }
}
