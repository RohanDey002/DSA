package Arrays;


import java.util.ArrayList;
import java.util.Arrays;

public class Leaders {
    public static void main(String[] args) {
        int[] arr ={1,7,3,6,4};
        System.out.println(leaders(arr));

    }

    public static ArrayList<Integer> leaders(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int max= nums[n-1];
        ans.add(n-1);
        for (int i = n-2; i >=0 ; i--) {
            if (nums[i]>max){
                ans.add(nums[i]);
                max = nums[i];

            }

        }
        return ans;
    }

}

