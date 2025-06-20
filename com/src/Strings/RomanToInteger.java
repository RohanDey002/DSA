package Strings;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
         String s = "MCMXCIV";
        System.out.println(romanToint(s));
    }
    static  int romanToint(String s){
        HashMap<Character,Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);

        int ans=0;

        for (int i = 0; i < s.length(); i++) {
            if(i<s.length()-1 && mp.get(s.charAt(i))<mp.get(s.charAt(i+1))){
                ans+= mp.get(s.charAt(i+1))-mp.get(s.charAt(i));
                i+=1;
            }else {
                ans+=mp.get(s.charAt(i));
            }

        }

        return ans;
    }
}

//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000