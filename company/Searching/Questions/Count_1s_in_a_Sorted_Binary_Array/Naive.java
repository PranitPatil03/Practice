package com.company.Searching.Questions.Count_1s_in_a_Sorted_Binary_Array;

public class Naive {
    public static void main(String[] args) {
        int[] arr={0,0,0,0};
        int ans=count(arr);
        System.out.println(ans);
    }
    static int count(int[] arr){

        int count=0,x=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
}
