package Greedy_Algorithm;

public class ContainMaxWater {
    public static void main(String[] args) {
        int[] height ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    static int maxArea(int[] height) {
        int maxWater=0;
        int left=0;
        int right= height.length-1;
        while(left<=right){
            if(height[left]<=height[right]){
                int distance = right-left;
                maxWater=Math.max(maxWater,height[left]*distance);
                left++;

            }else{
                int distance = right-left;
                maxWater=Math.max(maxWater,height[right]*distance);
                right--;
            }
        }
        return maxWater;
    }
}
