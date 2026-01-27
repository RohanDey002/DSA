package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    static void main(String[] args) {
        List<List<Integer>> result  = combinationSum3(3,9);
        for (List<Integer> ls : result){
            System.out.println(ls);

        }

    }

   static List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>> result = new ArrayList<>();
         solve(k,n,1,result, new ArrayList<>());
         return result;
    }
    static void solve(
            int k , int n , int index ,
            List<List<Integer>> result , List<Integer> temp){
        if(temp.size()==k){
            if(n==0){
                result.add(new ArrayList<>(temp));
            }
            return;
        }

        if(n<0)return;

        for (int i = index; i <=9 ; i++) {
            if(i>n) break;
            temp.add(i);
            solve(k,n-i,i+1,result,temp);
            temp.remove(temp.size()-1);

        }
    }
}
