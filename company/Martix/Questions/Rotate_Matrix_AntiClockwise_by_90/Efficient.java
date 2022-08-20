package com.company.Martix.Questions.Rotate_Matrix_AntiClockwise_by_90;

public class Efficient {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,1,2,3},
                {4,5,6,7}
        };
        transpose(arr,4);
    }
    static void transpose(int[][] arr,int n){

        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n; j++) {
                swap1(arr,i,j);
            }
        }

        for (int i = 0; i <n; i++) {
            int low=0,high=n-1;
            while (low<high){
                swap2(low,high,i,arr);
                low++;
                high--;
            }
        }

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void swap1(int [][]mat, int i, int j)
    {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
    static void swap2(int low, int high, int i, int mat[][])
    {
        int temp = mat[low][i];
        mat[low][i] = mat[high][i];
        mat[high][i] = temp;
    }
}
