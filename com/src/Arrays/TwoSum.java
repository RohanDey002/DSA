package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
       int [] result = twoSum(arr,9);
       for (int val:result){
           System.out.println(val);
       }
    }
    static  int [] twoSum (int[] nums , int target){
        int [] arr = new int[2];

        Map<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = target-nums[i];
            if(mp.containsKey(rem)){
                arr[0]=mp.get(rem);
                arr[1]=i;
            }
            mp.put(nums[i],i );
        }
        return arr;
    }
}
