package com.company.Martix.Theory.Multidimensional_Array;

public class method3 {
    public static void main(String[] args) {
        int m = 3, n = 6;

        int [][]arr = new int[m][n];

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = 10;

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
