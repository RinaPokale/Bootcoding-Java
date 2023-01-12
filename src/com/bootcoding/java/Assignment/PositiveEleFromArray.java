package com.bootcoding.java.Assignment;

public class PositiveEleFromArray {

    public int[] positiveElementFromArray(int[] num){
        int count = PositiveEleFromArray.getPositiveCount(num);
        int[] positiveNum = new int[count];
        int indx = 0;

        for(int i = 0; i < num.length; i++){
            if(num[i] > 0){
                positiveNum[indx++] = num[i];
//                indx++;
            }
        }
        return positiveNum;
    }

    public static int getPositiveCount(int[] num){
        int count = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] > 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        PositiveEleFromArray ps = new PositiveEleFromArray();

        int[] num = {1, -2, 2, -43};
        int[] positiveNum = ps.positiveElementFromArray(num);

        for(int i = 0; i < positiveNum.length; i++){
            System.out.println(positiveNum[i]);
        }

    }
}
