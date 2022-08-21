package com.company.Martix.Questions.Lucky_Numbers_in_a_Matrix;

//A lucky number is an element of the matrix such that
//it is the minimum element in its row and maximum in its column.

import java.util.ArrayList;
import java.util.Arrays;

public class Efficient {
    public static void main(String[] args) {
        int[][] mat= {
                {3,7,8},
                {9,2,13},
                {15,16,17}
        };
        System.out.println(luckyNumbers(mat));

    }
    static ArrayList<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] mi = new int[m], mx = new int[n];
        Arrays.fill(mi, Integer.MAX_VALUE);
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                mi[i] = Math.min(matrix[i][j], mi[i]);
                mx[j] = Math.max(matrix[i][j], mx[j]);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (mi[i] == mx[j])  {
                    res.add(mi[i]);
                    break;
                }
            }
        }
        return res;
    }
}
