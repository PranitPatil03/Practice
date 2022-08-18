package com.company.Searching.Questions.Index_of_last_Occurrence_in_Sorted;

public class Recursive {
    public static void main(String[] args) {

        int[] arr={1,2,4,5,5,5,5};

        int ans=lastOccurrence(arr,0, arr.length, 5);

        System.out.println(ans);
    }
    static int lastOccurrence(int[] arr,int low,int high,int x){

        if(low>high)
            return -1;

        int mid=(low+high)/2;

//        if the given value is smaller then go to left part

        if(arr[mid]>x){
            return lastOccurrence(arr, low, mid-1, x);
        }

//        if the given value is greater then go to right part

        else if(arr[mid]<x){
            return lastOccurrence(arr, mid+1, high, x);
        }

//        if we get ans, then check the previous index

        else{
            if(mid==arr.length-1 || arr[mid+1]!=arr[mid])
                return mid;
            else
                return lastOccurrence(arr, mid+1, high, x);
        }

    }
}
