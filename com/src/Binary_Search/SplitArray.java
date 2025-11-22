package Binary_Search;

import java.util.Arrays;

public class SplitArray {
    static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
        System.out.println(splitArray(nums,k));
    }

    static int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (findMaxSum(nums,mid)>k){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return low;
    }

    static int findMaxSum(int[] nums , int mid){
        int n = nums.length;
        int subArray = 1;
        long sum =0;
        for (int i = 0; i < n; i++) {
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }else {
                subArray+=1;
                sum=nums[i];
            }
        }
        return subArray;
    }
}
