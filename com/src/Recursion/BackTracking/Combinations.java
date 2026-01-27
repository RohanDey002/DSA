package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Combinations {
    static void main(String[] args) {
        List<List<Integer>> result = combine(4,2);
        for (List<Integer> ls : result){
            System.out.println(ls);
        }

    }
    static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combinations(n,k,1,result,new ArrayList<>());
        return result;

    }

    static void combinations(int n , int k ,int start, List<List<Integer>> result , List<Integer> cur){
          if(cur.size()==k){
              result.add(new ArrayList<>(cur));
              return;
          }

        for (int i = start; i <=n ; i++) {
            cur.add(i);
            combinations(n,k,i+1,result,cur);
            cur.remove(cur.size()-1);

        }
    }
}
