package com.company.Hash_Tables.Questions.Union_of_two_unsorted_arrays;

import java.util.HashSet;
import java.util.Set;

public class Efficient {
    public static void main(String[] args) {
        int[] a={10,20,5,15};
        int[] b={15,15,15,20,10};
        int ans=union(a,b);
        System.out.println(ans);
    }
    static int union(int[] a,int[] b){
        Set<Integer>set=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        return set.size();
    }
}
