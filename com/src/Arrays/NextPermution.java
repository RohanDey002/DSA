package Arrays;

import java.util.Arrays;

public class NextPermution {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int[] ans = nextPermutaion(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] nextPermutaion(int[] nums){
        //Find the break point
        int n = nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        // If break point not found
            if (index==-1){
                reverse(nums,0,n-1);
                return nums;
            }
           // Find and swap very next largest value of the break point
            for (int j = n-1; j >index ; j--) {
                if(nums[j]>nums[index]){
                    int temp = nums[j];
                    nums[j]=nums[index];
                    nums[index]=temp;
                    break;
                }
            }
            // Reverse and rearrange values ander break point
            reverse(nums,index+1,n-1);

        return nums;
    }

    public static int[] reverse(int[] arr,int start,int end){
        while (start<end){
            int tem = arr[start];
            arr[start]=arr[end];
            arr[end]=tem;
            start++;
            end--;
        }
        return arr;
    }
}

