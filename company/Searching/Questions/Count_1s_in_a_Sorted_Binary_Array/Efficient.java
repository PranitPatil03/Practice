package com.company.Searching.Questions.Count_1s_in_a_Sorted_Binary_Array;

// Count 1s in a Sorted Binary Array

public class Efficient {
    public static void main(String[] args) {
        int[] arr={0,0,0,0,1,1,1,1,1,1};
        int ans=countOnes(arr);
        System.out.println(ans);
    }

    static int countOnes(int[] arr){

        int low=0,high= arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==0){
                low=mid+1;
            }
            else{
                if(mid==0 || arr[mid-1]==0){
                    return (arr.length-mid);
                }else{
                    high=mid-1;
                }
            }
        }
        return 0;
    }

}
