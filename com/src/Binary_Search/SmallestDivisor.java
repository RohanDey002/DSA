package Binary_Search;

import java.util.Arrays;

public class SmallestDivisor {
    public static void main(String[] args) {
        int[]  arr ={1,2,5,9};
        System.out.println(smallestDivisor(arr,6));
    }

    static int smallestDivisor(int[] nums, int threshold) {
         int low = 1;
         int high = Arrays.stream(nums).max().getAsInt();


         while (low<=high){
             int mid = low+(high-low)/2;
             int result = findDivisor(nums,mid);
             if(result<=threshold){
                 high=mid-1;
             }else {
                 low=mid+1;
             }
         }
         return low;
    }

    static int findDivisor(int[]  nums , int divisor){
        int minDivisor = 0;
        for(int val : nums){
            minDivisor+= Math.ceil((double) val/divisor);
        }
        return minDivisor;
    }
}
