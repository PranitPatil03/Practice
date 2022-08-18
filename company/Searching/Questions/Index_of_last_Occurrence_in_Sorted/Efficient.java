package com.company.Searching.Questions.Index_of_last_Occurrence_in_Sorted;

public class Efficient {
    public static void main(String[] args) {
        int[] arr={0,1,2,4,5,6,7,7,8};

        int ans=lastocc(arr,7);

        System.out.println(ans);
    }
    static int lastocc(int[] arr,int x){

        int low=0,high= arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]>x){
                high=mid-1;
            }else if (arr[mid]<x){
                low=mid+1;
            }else{
                if(mid== arr.length-1 || arr[mid]!=arr[mid+1]){
                    return mid;
                }else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
}
