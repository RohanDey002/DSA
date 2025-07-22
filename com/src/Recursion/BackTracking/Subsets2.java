package Recursion.BackTracking;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Problem Statement: Given an array of integers that may contain duplicates the task
// is to return all possible subsets. Return only unique subsets and they can be in any order.
//
//Examples:
//
//Example 1:
//
//Input: array[] = [1,2,2]
//
//Output: [ [ ],[1],[1,2],[1,2,2],[2],[2,2] ]
public class Subsets2 {
    public static void main(String[] args) {
        int [] arr = {2,1,2};
        List<List<Integer>> result = Subsets2(arr);
        for (List<Integer> it : result){
            System.out.println(it);
        }

    }
    static List<List<Integer>> Subsets2(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(nums,0,result,new ArrayList<>());
        return result;

    }
    static void findSubsets(int[] nums ,int index, List<List<Integer>> result,List<Integer> current){
             result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length ; i++) {
            if(i!=index && nums[i]==nums[i-1])continue;
                current.add(nums[i] );
                findSubsets(nums,i+1,result,current);
                current.remove(current.size()-1);

        }
    }

// This approach is using HashSet to eliminate duplicates .
//    public static void fun(int[] nums, int index, List < Integer > ds, HashSet < String > res) {
//        if (index == nums.length) {
//            Collections.sort(ds);
//            res.add(ds.toString());
//            return;
//        }
//        ds.add(nums[index]);
//        fun(nums, index + 1, ds, res);
//        ds.remove(ds.size() - 1);
//        fun(nums, index + 1, ds, res);
//    }
//    public static List < String > subsetsWithDup(int[] nums) {
//        List < String > ans = new ArrayList < > ();
//        HashSet < String > res = new HashSet < > ();
//        List < Integer > ds = new ArrayList < > ();
//        fun(nums, 0, ds, res);
//        for (String it: res) {
//            ans.add(it);
//        }
//        return ans;
//    }
}
