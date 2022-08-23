package com.company.Hash_Tables.Questions.Longest_Subarray_with_equal_number_of_0s_and_1s;

import java.util.HashMap;
import java.util.Map;

public class Efficient {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1,0,0};
        int ans=subArrayEqual0and1(arr,arr.length);
        System.out.println(ans);
    }
    static int subArrayEqual0and1(int[] arr,int n){
        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0, maxLen = 0;
        for(int i = 0; i < n; i++)
            arr[i] = (arr[i] == 0) ? -1 : 1;

//        {1,0,1,1,1,0,0} --> {1,-1,1,1,1,-1,-1}

        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
            if (sum == 0)
                maxLen = i+1;

            if(hm.containsKey(sum + n) == true)
            {
                if(maxLen < i - hm.get(sum + n))
                    maxLen = i - hm.get(sum + n);

            }else hm.put(sum + n, i);
        }
        return maxLen;
    }

}
