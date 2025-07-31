package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindow {
    public static void main(String[] args) {
          String s="ddaaabbca";
          String t="abc";
        System.out.println(miniwindow(s,t));
    }

    static String miniwindow(String s, String t){
        int minlen = Integer.MAX_VALUE;
        int startIndex=-1;
        int ctn=0;
        int right =0;
        int left =0;
        Map<Character,Integer> mp = new HashMap<>();

        for (int i =0;i<t.length();i++){
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        }

        while (right<s.length()){
           if(mp.containsKey(s.charAt(right))){
               if (mp.get(s.charAt(right))>0) ctn++;
               mp.put(s.charAt(right),mp.get(s.charAt(right))-1);

           }
           while (ctn==t.length()){
               if (right - left + 1 < minlen) {
                   minlen = right - left + 1;
                   startIndex = left;
               }
               if (mp.containsKey(s.charAt(left))){
                   mp.put(s.charAt(left),mp.get(s.charAt(left))+1);
                   if (mp.get(s.charAt(left))>0) ctn--;
               }
               left++;

           }
            right++;
        }
        return startIndex==-1?"":s.substring(startIndex,startIndex+minlen);
    }
}
