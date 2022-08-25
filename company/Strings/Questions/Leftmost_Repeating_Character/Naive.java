package com.company.Strings.Questions.Leftmost_Repeating_Character;

public class Naive {
    public static void main(String[] args) {
        String str="cacbb";
        int ans=leftmost(str);
        System.out.println(ans);
    }
    static int leftmost(String str){
        for (int i = 0; i <str.length(); i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }
}
