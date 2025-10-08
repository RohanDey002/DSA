package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int []  arr ={-1,0,1,3,4,7};
        System.out.println(binarySearch(arr,4));

    }

    static int binarySearch(int[] nums ,int target){
        int start =0 , end = nums.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target) return mid;
            else if (nums[mid]>target) {
                end=mid-1;
            }
            else start=mid+1;
        }
        return -1;
    }
}
