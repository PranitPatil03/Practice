package com.company.Hash_Tables.Questions.Frequencies_of_array_elements;

import java.util.HashMap;

public class Efficient {
    public static void main(String[] args) {
        int[] arr={8,3,3,3,3,3,3,4,2,5};
        countFreq(arr, arr.length);

    }
    static void countFreq(int arr[], int n)
    {
        HashMap<Integer, Integer> hmp = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            int key = arr[i];
            if(hmp.containsKey(arr[i]) == true)
                hmp.put(arr[i], hmp.get(arr[i]) + 1);
            else
                hmp.put(arr[i], 1);
        }

        for(HashMap.Entry<Integer, Integer> itr: hmp.entrySet())
            System.out.println(itr.getKey() + " " + itr.getValue());
    }
}
