package com.company.Martix.Questions.Rotate_Matrix_AntiClockwise_by_90;

//TC:O(n^2)

//SC:O(n^2)

public class Naive {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        transpose(arr,3);
    }
    static void transpose(int[][] arr,int n){
        int[][] temp=new int[n][n];

        for (int i = 0; i <n; i++) {
            for (int j = 0; j<n; j++) {
                temp[n-j-1][i]=arr[i][j];
            }
        }

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                arr[j][i]=temp[j][i];
            }
        }

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
