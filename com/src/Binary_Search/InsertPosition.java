package Binary_Search;

public class InsertPosition {
    public static void main(String[] args) {
        int[] arr ={1,3,5,6};
        System.out.println(searchInsert(arr,4));
    }

    static int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int ans = nums.length;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if (nums[mid]>target) {
                ans=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return ans;
    }
}
