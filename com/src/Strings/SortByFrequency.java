package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// sort characters by frequency in descending order
public class SortByFrequency {
    public static void main(String[] args) {
        String s = "abc";
        String ans = sort(s);
        System.out.println(ans);
    }

    static String sort(String s){
        StringBuilder st = new StringBuilder();
        Map<Character,Integer> mp = new HashMap<>();
        List<Character>[]arr = new ArrayList[s.length()+1];
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
       mp.keySet().forEach(
               character -> {
                  if(arr[mp.get(character)]==null){
                      arr[mp.get(character)]=new ArrayList<>();
                  }
                  arr[mp.get(character)].add(character);
               }
       );
        for (int i = arr.length-1; i >0; i--) {
            if(arr[i]!=null){
                for (Character c :arr[i]){
                    for (int j = 0; j <i ; j++) {
                        st.append(c);
                    }
                }
            }

        }
        return st.toString();
    }

}
