package com.company.Hash_Tables.Questions.Subarray_with_zero_sum;

public class Naive {
    public static void main(String[] args) {
        int[] arr={8,3,3,3,3,3,3,4,2,5};
        System.out.println(sumZero(arr));
    }
    static boolean sumZero(int[] arr){

        int sum=0;
        for(int i=0;i< arr.length;i++){
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if (sum==0){
                    return true;
                }
            }
        }
        return false;
    }
}
