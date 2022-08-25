package com.company.Strings.Questions.Leftmost_Nonrepeating_Element;

public class Naive {
    public static void main(String[] args) {
        String str="acabb";
        int ans=notleftmost(str);
        System.out.println(ans);
    }
    static int notleftmost(String str){
        for (int i = 0; i <str.length(); i++) {
            boolean flag=false;
            for (int j = 0; j <str.length() ; j++) {
                if (i!=j && str.charAt(i)==str.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if (!flag)return i;
        }
        return -1;
    }
}
