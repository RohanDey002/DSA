package Strings;

import java.util.Arrays;

public class CheckAngrams {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    static boolean isAnagram(String s, String t){
        if (s.length()!=t.length()) return false;
        int [] freq = new int[26];
        for (int i = 0; i <s.length() ; i++) {
            freq[s.charAt(i)-'a']+=1;
        }
        for (int i = 0; i <t.length() ; i++) {
            freq[t.charAt(i)-'a']-=1;
        }
        for (int i = 0; i < freq.length ; i++) {
           if (freq[i]!=0) return false;
        }
        return true;

//        String str1 = sort(s);
//        String str2 = sort(t);
//        for (int i = 0; i <s.length() ; i++) {
//            if(str1.charAt(i)!=str2.charAt(i)) return false;
//        }
//
//      return true;
//    }
//    static  String sort( String st){
//        char[] c = st.toCharArray();
//        Arrays.sort(c);
//        return new String(c);
    }
}
