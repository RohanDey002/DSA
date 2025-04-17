package Arrays;

//Check of the array is sorted or not
public class SortedArray {
    public static void main(String[] args) {
        int[] arr={2,3,5,7};
        System.out.println(isSorted(arr));

    }
    static boolean isSorted(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>=nums[i-1]){

            }else {
                return false;
            }
        }
        return true;
    }
}
