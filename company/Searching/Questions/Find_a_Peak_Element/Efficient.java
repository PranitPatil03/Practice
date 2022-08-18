package com.company.Searching.Questions.Find_a_Peak_Element;

public class Efficient {
    public static void main(String[] args) {
        int[] arr={5,48,10,15,7};
        int ans=peak(arr);
        System.out.println(ans);
    }

//    Logic ==> first find the mid & then check is neighbours are
//    smaller then return mid because it is probably
//    the peak element , but if left side element of mid is greater
//    then change the high and similarly check for right
//    side & change the low


    static int peak(int[]arr){
        int low=0,high=arr.length;

        while(low<=high){
            int mid=(low+high)/2;
            if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==arr.length-1 || arr[mid+1]<=arr[mid])){
                return arr[mid];
            }
            if(mid>0 && arr[mid-1]>=arr[mid]){
                high=mid-1;
            }else {
                low=mid+1;
            }

        }
        return -1;
    }
}
