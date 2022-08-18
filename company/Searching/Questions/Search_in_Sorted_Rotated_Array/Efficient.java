package com.company.Searching.Questions.Search_in_Sorted_Rotated_Array;

//Search an element in a sorted and rotated array

//TC:O(log n)

public class Efficient {
    public static void main(String[] args) {
        int[] arr={100,200,400,100,10,20};
        int ans=search(arr,10);
        System.out.println(ans);
    }
    static int search(int[] arr,int x){
        int low=0,high=arr.length-1;

        while(low<=high){
            int mid=low + (high-low)/2;

            if(arr[mid]==x){
                return mid;
            }

            //Left Half
            if(arr[low]<arr[mid]){ //check with low
                if(x>=arr[low] && x<arr[mid]){  //check in the updated range
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            //Right Half
            else{
                if(x>arr[mid] && x<=arr[high]){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }

        }
        return -1;
    }
}
