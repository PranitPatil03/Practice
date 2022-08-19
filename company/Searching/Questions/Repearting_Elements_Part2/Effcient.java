package com.company.Searching.Questions.Repearting_Elements_Part2;

public class Effcient {
    public static void main(String[] args) {
        int[] arr={2,1,3,3,3};
        int ans=repeat(arr);
        System.out.println(ans);
    }
    static int repeat(int arr[])
    {
        int slow = arr[0], fast = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];

        }while(slow != fast);

        slow = arr[0];

        while(slow != fast)
        {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
