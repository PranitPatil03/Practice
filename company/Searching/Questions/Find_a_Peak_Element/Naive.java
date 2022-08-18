package com.company.Searching.Questions.Find_a_Peak_Element;

public class Naive {
    public static void main(String[] args) {
        int[] arr={5,10,48,20,15,7,34,3};
        int ans=peak(arr);
        System.out.println(ans);
    }
    static int peak(int arr[]){

        if(arr.length==1)return arr[0];

        if(arr[0]>arr[1])return arr[0];

        if(arr[arr.length-1]>arr[arr.length-2])return arr[arr.length-1];

        for (int i=1; i < arr.length-1 ; i++) {
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

}
