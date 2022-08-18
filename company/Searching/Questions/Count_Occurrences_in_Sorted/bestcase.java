package com.company.Searching.Questions.Count_Occurrences_in_Sorted;

public class bestcase {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,5,5,5,5,6,7,7,8};

        int ans=countocc(arr,5);

        System.out.println(ans);
    }

    static int countocc(int[] arr,int x){

        int first=firstocc(arr,x);

        int last=lastocc(arr, x);

        if(first==-1){
            return 0;
        }

        else {
            return last - first + 1;
        }
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
