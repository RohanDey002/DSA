package Sliding_Window;


public class NiceSubarray {
    public static void main(String[] args) {
        int [] arr ={2,2,2,1,2,2,1,2,2,2};
        int k=2;
        System.out.println(numberOfSubarrays(arr,k));

    }

    static  int numberOfSubarrays(int[] nums, int k) {
        return countNice(nums,k)- countNice(nums,k-1);

    }
    static int countNice(int [] nums,int k){
        if (k<0) return 0;
        int right=0;
        int left=0;
        int nice=0;
        int ctn=0;


        while (right< nums.length){
          if(nums[right]%2!=0){
              ctn++;
          }
          while (ctn>k){
              if(nums[left]%2!=0) {
                  ctn--;
              }
              left++;
          }
          nice = nice+(right-left+1);
           right++;
        }
        return nice;
    }
}
