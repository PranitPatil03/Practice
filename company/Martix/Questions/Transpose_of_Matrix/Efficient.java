package com.company.Martix.Questions.Transpose_of_Matrix;

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
                swap(arr,i,j);
            }
        }

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void swap(int [][]mat, int i, int j)
    {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }


}
