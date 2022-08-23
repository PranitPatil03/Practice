package com.company.Hash_Tables.Questions.Longest_Subarray_with_equal_number_of_0s_and_1s;

//Longest Sub_array with equal number of 0s and 1s



public class Naive {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1,0,0};
        int ans=subArrayEqual0and1(arr);
        System.out.println(ans);
    }
    static int subArrayEqual0and1(int[] arr){

        int res=0;
        for (int i = 0; i < arr.length; i++) {
            int countZero=0;
            int countOne=0;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]==0){
                    countZero++;
                }
                else {
                    countOne++;
                }
                if (countOne==countZero){
                    res=Math.max(res,countOne+countZero);
                }
            }
        }
        return res;
    }
}
