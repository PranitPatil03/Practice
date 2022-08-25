package com.company.Strings.Questions.Leftmost_Nonrepeating_Element;

public class better {
    public static void main(String[] args) {
        String str="aabbcded";
        int ans=nonRep(str);
        System.out.println(ans);
    }
    static final int CHAR=256;
    static int nonRep(String str)
    {
        int[] count=new int[CHAR];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]==1)return i;
        }
        return -1;
    }
}
