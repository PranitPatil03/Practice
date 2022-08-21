package com.company.Hash_Tables.Questions.Pair_with_given_sum_in_unsorted_array;

import java.util.HashSet;
import java.util.Set;

public class Efficient {
    public static void main(String[] args) {
        int[] arr={8,3,4,2,5};
        System.out.println(ispair(arr,6));
    }
    static boolean ispair(int[]arr,int sum){
        HashSet<Integer>set=new HashSet<>();
        for (int i = 0; i < arr.length; i++)
        {
            if (set.contains(sum - arr[i]))
                return true;

            set.add(arr[i]);

        }
        return false;
    }
}
