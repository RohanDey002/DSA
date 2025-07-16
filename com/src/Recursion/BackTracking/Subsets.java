package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
       List<List<Integer>> ls = subsets(arr);
       for (List<Integer> it : ls){
           System.out.println(it);
       }
    }

    static List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();

         findsubsets(nums,0,result,new ArrayList<>());
         return result;
    }

    static void findsubsets(int [] arr , int index ,List<List<Integer>> result,List<Integer> current){
        if(index== arr.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(arr[index] );
        findsubsets(arr,index+1,result,current);
        current.remove(current.size()-1);
        findsubsets(arr, index+1, result, current);
    }
}
