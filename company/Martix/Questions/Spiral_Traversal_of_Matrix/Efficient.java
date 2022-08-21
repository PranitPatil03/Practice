package com.company.Martix.Questions.Spiral_Traversal_of_Matrix;

public class Efficient {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,1,2,3},
                {4,5,6,7}
        };
        Spiral_traversal(4,4,arr);
    }
    static void Spiral_traversal(int r,int c,int[][]arr){
        int top=0,left=0,right=c-1,bottom=r-1;

        while(top<=bottom && left<=right){
            //Top Row
            for (int i = left; i <=right; i++) {
                System.out.print(arr[top][i]+" ");
            }
            top++;
            //Right Column
            for (int i =top; i <=bottom; i++) {
                System.out.print(arr[i][right]+" ");
            }
            right--;
            //Bottom Row
            if(top<=bottom){
                for (int i = right; i >=left; i--) {
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }
            //Left Column
            if(left<=right){
                for (int i = bottom; i>=top; i--) {
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
    }

}
