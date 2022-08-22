package com.company.Hash_Tables.Questions.Subarray_with_given_sum;

public class Naive {
    public static void main(String[] args) {
        int[] arr={5,8,6,13,3,-1};
        System.out.println(givenSum(arr,22));
    }
    static boolean givenSum(int[] arr,int x){

        for(int i=0;i< arr.length;i++){
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if (sum==x){
                    return true;
                }
            }
        }
        return false;
    }
}
