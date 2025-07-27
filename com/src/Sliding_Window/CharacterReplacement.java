package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

//longest repeating character replacement
//
public class CharacterReplacement {
    public static void main(String[] args) {
      String  s = "AAABBCCCCD";
      int k = 2;
        System.out.println(find(s,k));
    }
    static int find(String s,int k){
        int right =0 ;
        int left =0;
        int maxlen =0;
        int maxfreq =0;
        Map<Character,Integer> mp = new HashMap<>();
        while (right<s.length()){
            mp.put(s.charAt(right),mp.getOrDefault(s.charAt(right),0)+1);
            maxfreq=Math.max(maxfreq,mp.get(s.charAt(right)));
            if((right-left+1)-maxfreq>k){
                mp.put(s.charAt(left),mp.get(s.charAt(left))-1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}
