package com.company.Searching.Questions.Search_in_Infinite_Sized_Array;

//Given an infinite sized array, we need to write an efficient solution to search an element.

public class Naive {
    public static void main(String[] args) {
        int[] arr={5,6,45,47,65,87,96,98,676,6677,67676};
        int ans=search(arr,98);
        System.out.println(ans);
    }
    static int search(int[] arr,int x){
        int i=0;
        while(true){
            if(arr[i]==x){
                return i;
            }
            if(arr[i]>x){
                return -1;
            }
            i++;
        }
    }
}
