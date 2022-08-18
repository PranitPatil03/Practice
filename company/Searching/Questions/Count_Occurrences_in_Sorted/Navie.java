package com.company.Searching.Questions.Count_Occurrences_in_Sorted;

public class Navie {
    public static void main(String[] args) {
        int[] arr={10,20,20,20,30,30};
        int ans=count(arr,20);
        System.out.println(ans);
    }
    static int count(int[] arr,int x){

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
}
