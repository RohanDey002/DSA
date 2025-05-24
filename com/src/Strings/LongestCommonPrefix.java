package Strings;

import java.util.Arrays;

//Find the longest common prefix , means number of characters mostly matched in each words of string array
public class LongestCommonPrefix {
    public static void main(String[] args) {
//        String[] str= {"flower","flight","flor","flok"};
        String[] str= {"dog","racecar","car"};
        System.out.println(largestPrefix(str));
    }

    static String largestPrefix(String[] strs){
        String ans="";
        Arrays.sort(strs);
        for (int i = 0; i <= strs[0].length()-1; i++) {
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                    ans+=strs[0].charAt(i);
            }else break;
        }
        return ans;
    }
}
