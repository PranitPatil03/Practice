package com.company.Searching.Questions.Index_of_first_Occurrence_in_Sorted;

public class Iterative {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,5,6,7,7,8};

        int ans=firstocc(arr,7);

        System.out.println(ans);
    }
    static int firstocc(int[] arr,int x){

        int low=0,high= arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]>x){
                high=mid-1;
            }else if (arr[mid]<x){
                low=mid+1;
            }else{
                if(mid==0 || arr[mid]!=arr[mid-1]){
                    return mid;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
