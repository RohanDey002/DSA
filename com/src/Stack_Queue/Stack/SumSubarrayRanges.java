package Stack_Queue.Stack;


//You are given an integer array nums. The range of a subarray of nums is
// the difference between the largest and smallest element in the subarray.
//
//Return the sum of all subarray ranges of nums.
//
//A subarray is a contiguous non-empty sequence of elements within an array.

//LeetCode -> 2104. Sum of Subarray Ranges
public class SumSubarrayRanges {
    public static void main(String[] args) {
         int [] arr = {4,-2,-3,4,1};
        System.out.println(subArrayRanges(arr));
    }
    static long subArrayRanges(int[] nums) {
        return (long) MaxSubarraySum.sumSubarrayMax(nums)-MinSubarraySum.sumSubarrayMins(nums);
//      long result = 0;
//
//        for (int i = 0; i < nums.length ; i++) {
//            int max = nums[i];
//            int min = nums[i];
//            for (int j = i; j < nums.length ; j++) {
//                max=Math.max(max,nums[j]);
//                min=Math.min(min,nums[j] );
//                result+= max-(min);
//            }
//        }
//        return result;
    }
}
