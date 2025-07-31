package Sliding_Window;

public class SubarrayWithSum {
    public static void main(String[] args) {
     int[] nums={1,0,1,0,1};
     int goal=2;
        System.out.println(numSubarraysWithSum(nums,goal));

    }

    static int numSubarraysWithSum(int[] nums, int goal){
           return findsubarrays(nums,goal)-findsubarrays(nums,goal-1);
    }

    static int findsubarrays(int [] arr ,int goal){
        if(goal<0) return 0;
        int right=0;
        int left=0;
        int sum=0;
        int ctn=0;
        while (right<arr.length){
            sum+=arr[right];

            while (sum>goal){
                sum = sum-arr[left];
                left++;
            }
            ctn= ctn+ (right-left+1);
            right++;
        }
         return ctn;
    }
}
