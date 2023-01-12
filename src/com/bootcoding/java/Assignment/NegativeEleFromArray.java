package com.bootcoding.java.Assignment;

public class NegativeEleFromArray {
    public int[] negativeEleFromArray(int[] num){
        int count = NegativeEleFromArray.getNegativeCount(num);
        int[] negativeNum = new int[count];
        int indx = 0;

        for(int i = 0; i < num.length; i++){
            if(num[i] < 0){
                negativeNum[indx++] = num[i];
//                indx++;
            }
        }
        return negativeNum;

    }

    public static int getNegativeCount(int[] num){
        int count = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] <  0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] num = {-1, 2, -3, -4};

        NegativeEleFromArray ngNum = new NegativeEleFromArray();

        int[] negativeNum = ngNum.negativeEleFromArray(num);

        for(int i  = 0; i < negativeNum.length; i++){
            System.out.println(negativeNum[i]);
        }
    }
}
