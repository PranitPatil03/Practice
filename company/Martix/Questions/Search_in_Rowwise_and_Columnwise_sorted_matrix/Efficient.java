package com.company.Martix.Questions.Search_in_Rowwise_and_Columnwise_sorted_matrix;

//TC:O(R+C)

public class Efficient {
    public static void main(String[] args) {
        int [][]arr = {
                {10, 20, 30, 40 },
                {15, 25, 35, 45},
                {27, 29, 35, 45},
                {32, 33, 39, 50}
        };
        search(arr,375,4,4);
        System.out.println(arr.length);

    }
    static boolean search(int[][] arr,int x,int R,int C){
        int i=0,j=C-1;
        while(i<R && j>=0) {
            if (arr[i][j] == x) {
                return true;
            } else if (arr[i][j] > x) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
