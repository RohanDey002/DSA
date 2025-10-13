package Binary_Search;

//Leetcode -> 33. Search in Rotated Sorted Array
public class SearchInSortedArray {
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        System.out.println(search(arr,1));
    }
    static public int search(int[] nums, int target) {
        int low = 0 , high = nums.length-1;

        while (low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]== target) return mid;
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
        return -1;
    }
}
