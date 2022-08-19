package com.company.Searching.Questions.Repeating_Elements_Part1;

public class Efficient_Sol2 {
    public static void main(String[] args) {
        int[] arr={0,2,1,3,3,3};
        int ans=repeat(arr,arr.length);
        System.out.println(ans);
    }
    static int repeat(int[]arr,int n){

        boolean[] newArr=new boolean[n];

        for (int i = 0; i <arr.length; i++) {
            if (newArr[arr[i]]){
                return arr[i];
            }
            newArr[arr[i]]=true;
        }
        return -1;
    }
}
