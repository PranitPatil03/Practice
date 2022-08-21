package com.company.Martix.Questions.Search_in_Rowwise_and_Columnwise_sorted_matrix;

public class Navie {
    public static void main(String[] args) {
        int [][]arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 35, 45},
                {32, 33, 39, 50}
        };
        search(arr,35,4,4);
    }
    static void search(int [][]mat, int x,int R,int C)
    {
        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                if(mat[i][j] == x)
                {
                    System.out.println("Element Found at (" + i + ", " + j + ")");

                    return;
                }
            }
        }

        System.out.println("Not Found");
    }
}
