package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
    public static void main(String[] args) {
        List<List<String>> ans = partition("aabb");
        for (List<String> it : ans){
            System.out.println(it);
        }
    }
    static List<List<String>> partition(String s){
        List<List<String>> res = new ArrayList<>();
        solve(0,s,res,new ArrayList<>());
        return res;
    }
       static void solve(int index , String s ,List<List<String>> res, List<String> current ){
        if (index==s.length()){
            res.add(new ArrayList<>(current));
            return;
        }

           for (int i = index; i <s.length() ; i++) {
               if(isPalindrome(s,index,i)){
                   current.add(s.substring(index,i+1));
                   solve(i+1,s,res,current);
                   current.remove(current.size()-1);
               }
           }
       }

       static boolean isPalindrome(String s, int start,int end){
        while (start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return  true;
       }
}
