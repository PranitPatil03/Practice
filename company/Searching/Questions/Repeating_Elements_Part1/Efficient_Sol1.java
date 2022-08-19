package com.company.Searching.Questions.Repeating_Elements_Part1;

import java.util.Arrays;

//TC:O(nlogn)

public class Efficient_Sol1 {
    public static void main(String[] args) {
        int[] arr={0,2,1,3,3,3,3};
        int ans=repeat(arr);
        System.out.println(ans);
    }
    static int repeat(int[] arr) {

        Arrays.sort(arr);

        for (int i = 0; i <arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
}
