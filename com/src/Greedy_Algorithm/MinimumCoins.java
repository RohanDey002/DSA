package Greedy_Algorithm;
//Problem Statement: Given a value V, if we want to make a change for V Rs,
// and we have an infinite supply of each of the denominations in Indian currency,
// i.e., we have an infinite supply of { 1, 2, 5, 10, 20, 50, 100, 500, 1000}
// valued coins/notes, what is the minimum number of coins and/or notes needed to make the change.

import java.util.ArrayList;
import java.util.List;

public class MinimumCoins {
    public static void main(String[] args) {
        int[] coins ={1,2,5,10,20,50,100,200,500,1000};
        int target = 73;
        List<Integer> result = findcoins(coins,target);
        for (int val:result){
            System.out.println(val);
        }
    }
    static List<Integer> findcoins(int [] nums,int target){
        List<Integer> ans = new ArrayList<>();
        for (int i = nums.length-1; i >=0 ; i--) {
            while (target>=nums[i]){
                target-=nums[i];
                ans.add(nums[i] );
            }
        }
        return ans;
    }
}
