package com.company.Strings.Questions.Leftmost_Repeating_Character;

/*Explanation:

Make the visited arr and iterate from last index
if element already present then search in visited arr
*/

public class Efficient1 {
    public static void main(String[] args) {
        String str="acbb";
        int ans=leftmost(str);
        System.out.println(ans);
    }

    static final int CHAR=256;

    static int leftmost(String str){
        int res=-1;
        boolean[] visited=new boolean[CHAR];
        for (int i = str.length()-1; i >=0 ; i--) {
            if (visited[str.charAt(i)]) {
                res = i;
            }else {
                visited[str.charAt(i)]=true;
            }
        }
        return res;
    }
}
