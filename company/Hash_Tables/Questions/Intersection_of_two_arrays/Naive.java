package com.company.Hash_Tables.Questions.Intersection_of_two_arrays;

//TC:O(m*(n+m))

public class Naive {
    public static void main(String[] args) {
        int[] a={10,15,20,5,30};
        int[] b={30,5,30,80,20};
        int ans=intersection(a,b,a.length, b.length);
        System.out.println(ans);
    }
    static int intersection(int []a,int[]b,int m,int n){
        int res=0;
        for (int i = 0; i <m; i++) {
            boolean flag=false;
            for (int j = 0; j <i; j++) {
                if(a[i]==a[j]){
                    flag=true;
                    break;
                }
            }
            if (flag) {
                continue;
            }

            for (int j = 0; j <n; j++) {
                if (a[i]==b[j]){
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
