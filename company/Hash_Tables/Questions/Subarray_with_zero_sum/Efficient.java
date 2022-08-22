package com.company.Hash_Tables.Questions.Subarray_with_zero_sum;

//TC:O(n)
//Sc:O(n)
//Steps:1-->Find the PrefixSum
//Steps:2-->Make the HashSet and add values if already present in the set
//Steps:3-->if set does not contains the value then insert Now

import java.util.HashSet;

public class Efficient {
    public static void main(String[] args) {
        int[] arr={1,4,13,-3,-10,5};
        int[] ans={5,8,6,13,3,-1};
        System.out.println(zeroSum(arr));
    }
    static boolean zeroSum(int[] arr){
        HashSet<Integer>set=new HashSet<>();
        int prefixSum=0;
        for (int j : arr) {
            prefixSum += j; //Find the PrefixSum

            if (set.contains(prefixSum)) { // add value if already present in the set
                return true;
            }
            if (prefixSum == 0) {
                return true;
            }
            set.add(prefixSum);
        }
        return false;
    }
}

/*
    int[] ans={5,8,6,13,3,-1};  sum=22;

    prefixSum={5,13,19,32,35,34}

    5-22
    13-22
    19-22
    32-22 11
    35-22 13

 */

















