package com.company.Strings.Questions.Palindrome_Check;

//TC:O(N)
//SC:O(1)

public class Efficient {
    public static void main(String[] args) {
        String s="aba";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s){

        int low=0;
        int high=s.length()-1;

        while(low<high){
            if(s.charAt(low)==s.charAt(high)){
                low++;
                high--;
            }else{
                return false;
            }
        }
        return true;
    }
}
