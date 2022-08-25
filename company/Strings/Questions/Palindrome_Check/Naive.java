package com.company.Strings.Questions.Palindrome_Check;

//Palindrome Check

//TC:O(n)
//SC:O(n)

public class Naive {
    public static void main(String[] args) {
        String s="aba";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s){
        StringBuilder rev=new StringBuilder(s);
        rev.reverse();
        return s.equals(rev.toString());
    }
}
