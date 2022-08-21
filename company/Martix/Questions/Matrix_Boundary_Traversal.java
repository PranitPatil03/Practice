package com.company.Martix.Questions;

//boundary traversal problem
// first row left to right,
// last column top to bottom,
// last row right to left and first column bottom to top

public class Matrix_Boundary_Traversal {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {6,7,8},
                {1,5,3}
        };
        boundary_traversal(3,3,arr);
    }
    static void boundary_traversal(int r,int c,int[][]arr){
        if(r==1){
            for (int i = 0; i <c; i++) {
                System.out.print(arr[0][i]+" ");
            }
        }
        else if(c==1){
            for (int i = 0; i <r; i++) {
                System.out.print(arr[0][i]+" ");
            }
        }
        else{
            for (int i = 0; i <c; i++) {
                System.out.print(arr[0][i]+" ");
            }
            for (int i =1; i <r; i++) {
                System.out.print(arr[i][c-1]+" ");
            }
            for (int i = c-2; i >=0; i--) {
                System.out.print(arr[r-1][i]+" ");
            }
            for (int i = r-2; i>=1; i--) {
                System.out.print(arr[i][0]+" ");
            }
        }
    }
}
