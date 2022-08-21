package com.company.Hash_Tables.Questions.Count_Distinct_Elements;

import java.util.Arrays;
import java.util.HashSet;

public class Efficient {
    public static void main(String[] args) {
        int[] arr={8,3,3,3,3,3,3,4,2,5};
        System.out.println(distinct1(arr));
    }
    static int distinct1(int[] arr){
        HashSet<Integer>set=new HashSet<>();
        for (int x:arr){
            set.add(x);
        }
        return set.size();
    }
}
