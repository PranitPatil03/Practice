package com.company.Strings.Questions.Check_for_Anagram;

public class Efficient {
    public static void main(String[] args) {
      String S1="aabbccc";
      String S2="cccaabb";
        System.out.println(is_anagram(S1,S2));
    }
    static final int CHAR=256;
    static boolean is_anagram(String S1,String S2){

        if (S1.length() !=S2.length()){
            return false;
        }

        int[] count=new int[CHAR];

        for (int i = 0; i <S1.length(); i++) {
            count[S1.charAt(i)]++;
            count[S2.charAt(i)]--;
        }
        for (int i = 0; i <CHAR ; i++) {
            if (count[i]!=0){
                return false;
            }
        }
        return S1.equals(S2);
    }
}
