package com.company.Hash_Tables.Questions.Subarray_with_given_sum;
import java.util.HashSet;

//TC:O(n)
//SC:O(n)

public class Efficient {
    public static void main(String[] args) {
        int[] ans={5,8,6,1,3,-1};
        System.out.println(givenSum(ans,22));

    }
    static boolean givenSum(int[] arr,int x){
        HashSet<Integer> set=new HashSet<>();
        int prefixSum=0;

        for (int j : arr) {
            prefixSum += j;

            if (set.contains(prefixSum - x)) {
                return true;
            }
            if (prefixSum == x) {
                return true;
            }
            set.add(prefixSum);
        }
        return false;
    }
}

/*
Explanation

        int[] ans={5,8,6,13,3,-1};  sum=22;

        prefixSum={5,13,19,32,35,34}

        5-22
        13-22
        19-22
        32-22 11
        35-22 13 --Set contains 13

        int[] ans={5,8,6,1,3,-1 };

*/

