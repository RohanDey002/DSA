package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int [] arr = {1,2,1,2,1};
        List<List<Integer>> ls = combinationSum2(arr,4);
        for (List<Integer> it : ls){
            System.out.println(it);
        }
    }
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
          List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(candidates,0,target,result,new ArrayList<>());
        return result;
    }
    static void  findCombination(int[] candidates, int index,int target,List<List<Integer>> ans,List<Integer> current){
      if(target==0){
          ans.add(new ArrayList<>(current));
          return;
      }


        for (int i = index; i < candidates.length; i++) {
            if(i > index && candidates[i]==candidates[i-1]) continue;;
            if (candidates[i]>target) break;
            current.add(candidates[i] );
            findCombination(candidates,i+1,target-candidates[i],ans,current);
            current.remove(current.size()-1);
        }
    }
}
