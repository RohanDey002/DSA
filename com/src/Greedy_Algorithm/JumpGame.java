package Greedy_Algorithm;

public class JumpGame {
    public static void main(String[] args) {
        int [] nums={3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    static boolean canJump(int[] nums){
        int maxInd=0;
        for (int i = 0; i < nums.length; i++) {
            if(i>maxInd){
                return false;
            }
            maxInd=Math.max(maxInd,i+nums[i]);
        }
        return true;
    }
}
