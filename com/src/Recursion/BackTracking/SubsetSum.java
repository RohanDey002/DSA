package Recursion.BackTracking;

//Problem Statement: Given an array print all the sum of the
// subset generated from it, in the increasing order.


//Input: N = 3, arr[] = {5,2,1}
//
//Output: 0,1,2,3,5,6,7,8
//
//Explanation: We have to find all the subset’s sum and print them.in this case the
// generated subsets are [ [], [1], [2], [2,1], [5], [5,1], [5,2]. [5,2,1],
// so the sums we get will be  0,1,2,3,5,6,7,8

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        ArrayList<Integer> ans = subsetSum(arr);
        for (int value : ans){
            System.out.println(value);
        }
    }

    static ArrayList<Integer> subsetSum (int [] nums ){
        ArrayList<Integer> result = new ArrayList<>();
         findSum(nums,0,0,result);
        Collections.sort(result);
        return result;
    }

    static void findSum(int[] nums,int index, int sum ,ArrayList<Integer> result ){
        if(index== nums.length){
            result.add(sum);
            return;
        }

        findSum(nums,index+1,sum+nums[index],result);
        findSum(nums,index+1,sum,result);
    }
}
