package com.company.Strings.Questions.Check_if_a_String_is_Subsequence_of_Other;

//TC:O(n+m)
//SC:O(1)

public class Naive {
    public static void main(String[] args) {
        String S1="ABCD";
        String S2="ADE";
        System.out.println(Subsequence(S1,S2));
    }
    static boolean Subsequence(String S1,String S2){
        int j=0;
        for (int i = 0; i <S1.length() && j<S2.length() ; i++) {
            if (S1.charAt(i)==S2.charAt(j)){
                j++;
            }
        }
        return (j==S2.length());   //S2 reach end --> True/false
    }
}
