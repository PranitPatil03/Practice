package com.company.Searching.Questions.Search_in_Infinite_Sized_Array;

//Given an infinite sized array, we need to write an efficient solution to search an element.
//Unbounded Binary Search

public class Efficient {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,8,88,877,888,8888,88888,888888};
        int ans=search(arr,88);
        System.out.println(ans);
    }
    static int search(int[] arr,int x){
        if(arr[0]==x)return 0;
        int i=1;
        while(arr[i]<x){
            i=i*2;
        }
        if(arr[i]==x)
            return i;

        return binarySearch(arr,x,(i/2)+1 , i-1);
    }
    static int binarySearch(int array[], int x, int low, int high) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x)
                return mid;

            if (array[mid] < x)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

}
