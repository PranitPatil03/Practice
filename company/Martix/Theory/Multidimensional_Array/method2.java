package com.company.Martix.Theory.Multidimensional_Array;

public class method2 {
    public static void main(String[] args) {

        int m=3;
        int n=2;

        int[][] arr=new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
