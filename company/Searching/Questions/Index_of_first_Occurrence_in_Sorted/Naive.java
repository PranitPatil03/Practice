package com.company.Searching.Questions.Index_of_first_Occurrence_in_Sorted;

public class Naive {
    public static void main(String[] args) {

        int[] arr={1,2,4,5,5,6,7,7,8};

        int ans=firstocc(arr,7);

        System.out.println(ans);

    }
    static int firstocc(int arr[],int x){

        for (int i =0; i < arr.length; i++) {
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
