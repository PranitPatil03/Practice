package com.company.Searching.Questions.Two_Pointer_Approach.pair_with_sum_equals_to_x;

public class Efficient {
    public static void main(String[] args) {
        int[] arr={2,5,8,22,30};
        boolean ans=pair(arr,17);
        System.out.println(ans);
    }
    static boolean pair(int[] arr,int x){
        int left=0,right=arr.length-1;

        while(left<right){
            if(arr[left]+arr[right]==x){
                return true;
            }
            else if(arr[left]+arr[right]>x){
                right--;
            }else{
                left++;
            }
        }
        return false;
    }
}
