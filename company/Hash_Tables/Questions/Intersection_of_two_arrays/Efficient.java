package com.company.Hash_Tables.Questions.Intersection_of_two_arrays;

import java.util.HashSet;
import java.util.Set;

public class Efficient {
    public static void main(String[] args) {
        int[] a={10,15,20,5,30};//-->10,15,20,5,30  10 15 20 5  10 15   res=3
        int[] b={30,5,30,80,20};
        int ans=intersection(a,b);
        System.out.println(ans);
    }
    static int intersection(int[] a,int[] b){
        Set<Integer> s=new HashSet<>();
        int res=0;
        for (int x:a) {s.add(x);}

        for (int x:b) {
            if (s.contains(x)){
                res++;
                s.remove(x);
            }
        }
        return res;
    }
}
