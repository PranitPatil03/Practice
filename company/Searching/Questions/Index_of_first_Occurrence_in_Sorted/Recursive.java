package com.company.Searching.Questions.Index_of_first_Occurrence_in_Sorted;

public class Recursive {
    public static void main(String[] args) {

        int[] arr={1,2,4,5,5,6,7,7,8};

        int ans=firstOccurrence(arr,0, arr.length, 5);

        System.out.println(ans);
    }
    static int firstOccurrence(int[] arr,int low,int high,int x){

        if(low>high)
            return -1;

        int mid=(low+high)/2;

//        if the given value is smaller then go to left part

        if(arr[mid]>x){
            return firstOccurrence(arr, low, mid-1, x);
        }

//        if the given value is greater then go to right part

        else if(arr[mid]<x){
            return firstOccurrence(arr, mid+1, high, x);
        }

//        if we get ans, then check the previous index

        else{
            if(mid==0 || arr[mid-1]!=arr[mid])
                return mid;
            else
                return firstOccurrence(arr, low, mid-1, x);
        }

    }
}
