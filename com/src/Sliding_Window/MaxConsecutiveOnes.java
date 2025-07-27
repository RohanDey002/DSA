package Sliding_Window;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
         int [] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
         int k = 4;
        System.out.println(maxOnes(arr,k));
    }
    static int maxOnes(int[] nums,int k){
        int right =0 ;
        int left=0;
        int maxLen = 0;
        int zeros = 0;
        while (right<nums.length){
            if(nums[right]==0) zeros++;
            if(zeros>k){
                if(nums[left]==0) zeros--;
                left++;
            }
           if (zeros<=k) maxLen=Math.max(maxLen,right-left+1);
            right++;
        }

        return maxLen;
    }
}
