package Binary_Search;

public class FIrstLastOccurance {
    public static void main(String[] args) {
        int [] arr= {5,7,7,8,8,10};
        int [] result = searchRange(arr,8);
        for (int val:result){
            System.out.print(val+" ");
        }
    }

    static  int[] searchRange(int[] nums, int target) {
        if(nums.length<1) return new int[] {-1,-1};
       int first = findFist(nums,target);
       if(first==-1) return new int[] {-1,-1};
       int last = findLast(nums,target);
       return new int[] {first,last};
    }

    static int findFist(int[] nums, int x){
        int low = 0 , high = nums.length-1;
        int first =-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid]==x){
                first=mid;
                high=mid-1;
            } else if (nums[mid]>x) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return first;
    }

    static int findLast(int[] nums,int x ){
        int low = 0 , high = nums.length-1;
        int last =-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid]==x){
                last=mid;
                low=mid+1;
            } else if (nums[mid]>x) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return last;
    }
}
