package com.company.Hash_Tables.Questions.Longest_subarray_with_given_sum;

public class Naive {
    public static void main(String[] args) {
        int[] ans={1,2,1,2,1};
        int res=LongestSum(ans,3);
        System.out.println(res);
    }
    static int LongestSum(int[] arr,int sum){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            int prefixSum=0;
            for (int j = i; j < arr.length; j++) {
                prefixSum+=arr[j];
                if (prefixSum==sum){
                    ans= Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
}

/*
Explanation

     int[] ans={5,8,-4,-4,9,-2,2};

     prefixSum={5,13,9,5,13,11 13};

     first_range={13,9,5}
     second_range={-2,2}

*/