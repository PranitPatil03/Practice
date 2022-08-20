package com.company.Searching.Theory.Binary_Search;

public class Iteration {
    public static void main(String[] args) {
        int [] arr={ 3, 4, 5, 6, 7, 8, 9 };
//        int ans=binarySearch(arr,6,0,arr.length);
//        System.out.println(ans);
    }
    static int binarySearch(int[] array, int x, int low, int high) {

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
