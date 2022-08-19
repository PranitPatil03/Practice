package com.company.Searching.Questions.Repeating_Elements_Part1;

//TC:O(n2)

public class Naive {
    public static void main(String[] args) {
        int[] arr={0,2,1,3,2,2};
        int ans=repeat(arr);
        System.out.println(ans);
    }
    static int repeat(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
