package com.company.Searching.HardQuestions.Median_of_two_sorted_arrays;

//Given two sorted arrays nums1 and nums2 of size m and n respectively,
//return the median of the two sorted arrays.

//TC:O(log (m+n))

public class Efficient {
    public static void main(String[] args) {
        int[] a1 = {10, 20, 30, 40, 50}, a2 = {5, 15, 25, 35, 45};
        double ans= median(a1,a2);
        System.out.println(ans);
    }
    static double median(int[] arr1,int[] arr2){
        int n1=arr1.length,n2=arr2.length;
        int beg1=0,end1=n1;

        while(beg1<=end1){
            int i1=(beg1+end1)/2;
            int i2=(n1+n2+1)/2 -i1;

            int min1=(i1==n1)?Integer.MAX_VALUE :arr1[i1];

            int max1=(i1==0)?Integer.MIN_VALUE:arr1[i1-1];

            int min2=(i2==n2)?Integer.MAX_VALUE :arr2[i2];

            int max2=(i2==0)?Integer.MIN_VALUE:arr2[i2-1];

            if(max1<=min2 && max2<=min1){
                if((n1+n2)%2==0){
                    return ((double) Math.max(max1,max2)+ Math.min(min1,min2))/2;
                }else{
                    return ((double) Math.max(max1,max2));
                }
            }else if(max1>max2){
                end1=i1-1;
            }
            else{
                beg1=i1+1;
            }
        }
        return -1;
    }
}
