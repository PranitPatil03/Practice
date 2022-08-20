package com.company.Martix.Questions;

//TC:O(r*c)

public class Matrix_in_Snake_Pattern {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        print(arr);
    }
    static void print(int[][]arr){
        for (int i = 0; i <3; i++) {
            if(i%2==0){
                for (int j = 0; j <5; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }else {
                for (int j = 4; j >=0; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
