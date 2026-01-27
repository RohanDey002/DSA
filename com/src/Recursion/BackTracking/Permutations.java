package Recursion.BackTracking;

import java.util.*;

public class Permutations {
    static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> res = allpermutations(arr);
        for (List<Integer> ls : res){
            System.out.println(ls);
        }

    }

    static List<List<Integer>> allpermutations(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        //findPermutations(nums,result, new ArrayList<>(), new HashSet<Integer>());
        findPermutations(nums,0,result);
        return result;
    }

//    static void  findPermutations( int[] nums , List<List<Integer>> result ,List<Integer> temp, HashSet<Integer> st){
//
//        if(temp.size()== nums.length){
//            result.add(new ArrayList<>(temp));
//            return;
//        }
//
//        for (int i = 0; i <nums.length ; i++) {
//            if(st.contains(nums[i])) continue;
//            temp.add(nums[i] );
//            st.add(nums[i]);
//            findPermutations(nums,result,temp,st);
//            temp.remove(temp.size()-1);
//            st.remove(nums[i]);
//
//        }
//    }

    static void findPermutations(int[] nums ,int index, List<List<Integer>> result ){
        if(index== nums.length){
            List<Integer> current = new ArrayList<>();
            for (int i : nums)  current.add(i);
            result.add(current);
            return;
        }
        for (int i = index; i <nums.length ; i++) {
            swap(nums,index,i);
            findPermutations(nums,index+1,result);
            swap(nums,index,i);
        }
    }

    static void swap(int[] nums, int index, int i){
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }
}
