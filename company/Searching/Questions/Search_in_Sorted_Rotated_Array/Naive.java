package com.company.Searching.Questions.Search_in_Sorted_Rotated_Array;

//Search an element in a sorted and rotated array

//TC : O(n)

public class Naive {
    public static void main(String[] args) {
        int[] arr={100,200,400,100,10,20};
        int ans=search(arr,10);
        System.out.println(ans);
    }
    static int search(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
