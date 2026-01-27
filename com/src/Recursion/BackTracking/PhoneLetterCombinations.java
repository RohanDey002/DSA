package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneLetterCombinations {
    static void main(String[] args) {
        List<String> result = letterCombinations("279");
        for (String s : result){
            System.out.println(s);
        }

    }

   static List<String> letterCombinations(String digits) {
       Map<Character,String> mp = new HashMap<>();
       mp.put('2',"abc");
       mp.put('3',"def");
       mp.put('4',"ghi");
       mp.put('5',"jkl");
       mp.put('6',"mno");
       mp.put('7',"pqrs");
       mp.put('8',"tuv");
       mp.put('9',"xwyz");

       List<String> result = new ArrayList<>();
       if(digits.length()==0) return result;

       solve(0,digits,result,mp,"");


       return result;
    }
    static void solve(
            int index , String digits ,List<String> result ,
            Map<Character,String> mp ,String temp){

        if (index==digits.length()){
            result.add(temp);
            return;
        }

        String str = mp.get(digits.charAt(index));

        for (int i = 0; i < str.length(); i++) {

            solve(index+1,digits,result,mp,temp+str.charAt(i));

        }
    }
}
