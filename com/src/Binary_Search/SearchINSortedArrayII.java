package Binary_Search;

//Leetcode ->81. Search in Rotated Sorted Array II
public class SearchINSortedArrayII {
    public static void main(String[] args) {
        int[] arr= {3,1,2,3,3,3,3};
        System.out.println(search(arr,3));
    }
    static boolean search(int[] nums, int target) {
        int low = 0 , high = nums.length-1;

        while (low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]== target) return true;
            if(nums[low]==nums[mid]&& nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            else if (nums[mid]>=nums[low]) {
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }else {
                    low=mid+1;
                }
            }else {
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }else {
                    high=mid-1;
                }
            }
        }
        return false;
    }
}
