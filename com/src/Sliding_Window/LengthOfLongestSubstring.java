package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

//Given a String, find the length of longest substring without any repeating character.
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(findLength("abcebcdf"));
    }
    static  int findLength(String s){
        int left=0;
        int right = 0;
        int maxLen = Integer.MIN_VALUE;
        Map<Character,Integer> mp = new HashMap<>();
        while (right<s.length()){
            if (mp.containsKey(s.charAt(right))){
                left = Math.max(left,mp.get(s.charAt(right))+1);
            }

            mp.put(s.charAt(right),right);
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }

        return maxLen;
    }
}
