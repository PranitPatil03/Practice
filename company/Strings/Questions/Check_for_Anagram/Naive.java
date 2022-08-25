package com.company.Strings.Questions.Check_for_Anagram;

//TC:O(Nlog(N))
//SC:O(1)

import java.lang.reflect.Array;
import java.util.Arrays;

public class Naive {
    public static void main(String[] args) {
        String S1="aabbccc";
        String S2="cccaabb";
        System.out.println(is_anagram(S1,S2));
    }
    static boolean is_anagram(String S1,String S2){
        if (S1.length() !=S2.length()){
            return false;
        }
        char[] a1=S1.toCharArray();
        Arrays.sort(a1);
        S1=new String(a1);

        char[] a2=S2.toCharArray();
        Arrays.sort(a2);
        S2=new String(a2);

        return S1.equals(S2);
    }
}
