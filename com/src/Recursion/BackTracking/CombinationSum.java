package Recursion.BackTracking;

//Given an array of distinct integers and a target, you have to return the list
// of all unique combinations where the chosen numbers sum to target. You may return the combinations in any order.

import java.util.ArrayList;
import java.util.List;

//The same number may be chosen from the given array an unlimited number of times. T
// wo combinations are unique if the frequency of at least one of the chosen numbers is different.
public class CombinationSum {
    public static void main(String[] args) {
        int [] arr ={2,3,6,7};
        List<List<Integer>> ls = combinationSum(arr,6);
        for (List<Integer> it :ls){
            System.out.println(it);
        }
    }

   static List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            findCombination(candidates,0,target,result,new ArrayList<>());
            return result;

    }

    //Solution -> 1
    // This solution has more recursion calls, because it uses 'pick' & 'non-pick' approach. It is useful
    // for learning recursion in dept and solve this type of question further.
//    static  void  findCombination(int[] candidates, int index ,int target ,List<List<Integer>> ans,List<Integer> current){
//        if (index== candidates.length){
//            if (target==0){
//                ans.add(new ArrayList<>(current));
//            }
//            return;
//        }
//
//         if(candidates[index]<= target){
//             current.add(candidates[index]);
//             findCombination(candidates,index,target-candidates[index],ans,current);
//             current.remove(current.size()-1);
//
//         }
//         findCombination(candidates,index+1,target,ans,current);
//    }
// Solution-> 2
//This solution has less recursion calls because here we are iterating candidates using loop.
//This solution particularly designed for combination only.
static  void  findCombination(int[] candidates, int index ,int target ,List<List<Integer>> ans,List<Integer> current){
       if (target==0){
           ans.add(new ArrayList<>(current));
           return;
       }
       if (target<0) return;
    for (int i = index; i <candidates.length ; i++) {
        current.add(candidates[i] );
        findCombination(candidates,i,target-candidates[i],ans,current);
        current.remove(current.size()-1);
    }
  }
}
