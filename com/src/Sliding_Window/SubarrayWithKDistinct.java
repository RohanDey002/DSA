package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithKDistinct {
    public static void main(String[] args) {
        int [] arr ={1,2,1,3,4};
        int k=3;

        System.out.println(distinctSubarray(arr,k));
    }
    static int distinctSubarray(int[] nums,int k){
        return findSubarray(nums,k) - findSubarray(nums,k-1);
    }
       static int findSubarray(int[] nums ,int k){
        int ctn=0;
        int right=0;
        int left=0;
        Map<Integer,Integer> mp = new HashMap<>();
        while (right< nums.length){
            mp.put(nums[right],mp.getOrDefault(nums[right],0)+1 );

            while (mp.size()>k){
                mp.put(nums[left],mp.getOrDefault(nums[left],0)-1 );
                if (mp.get(nums[left])==0){
                    mp.remove((nums[left]));
                }
                left++;
            }
            ctn = ctn + (right-left+1);
            right++;

        }


        return ctn;
       }
}
