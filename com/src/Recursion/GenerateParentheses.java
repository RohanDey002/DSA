package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    static void main(String[] args) {
         List<String> ans = generateParentheses(3);
         for (String s : ans){
             System.out.println(s);
         }
    }

    static List<String> generateParentheses(int n){
        List<String> result = new ArrayList<>();
      //  generateAll("",result,n);
        generateAll("",0,0,n,result);
        return result;
    }
//Brute Force Approach
//     static void generateAll(String s, List<String> result, int n) {
//        if(s.length()==2*n){
//            if(isValid(s)) {
//                result.add(s);
//            }
//            return;
//        }
//
//        generateAll(s+')',result,n);
//        generateAll(s+'(',result,n);
//    }
//    static boolean isValid(String str){
//        int current =0;
//        for (char ch : str.toCharArray()){
//            if(ch=='(') current++;
//            else current--;
//            if(current<0) return false;
//        }
//        return current==0;
//    }


    // Optimal Approach
    static void generateAll(String str , int open ,int close , int n , List<String> res){
        if(str.length()==2*n){
            res.add(str);
            return;
        }

        if(open<n) generateAll(str+'(',open+1,close,n,res);
        if(close<open) generateAll(str+')',open,close+1,n,res);
    }
}
