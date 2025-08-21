package Stack_Queue.Stack;

//Given n non-negative integers representing an elevation map where
// the width of each bar is 1, compute how much water it can trap after raining.

//Trapping Rain Water (Leetcode 42)
public class TrappingWater {
    public static void main(String[] args) {
        int[] heights ={0,2,3,1,2,3};
        System.out.println(trap(heights));
    }
   static int trap(int[] height) {
     int total=0;
     int left=0,right= height.length-1;
     int maxLeft=0;
     int maxRight=0;

     while (left<=right){
         if(height[left]<=height[right]){
             if(height[left]>=maxLeft){
                 maxLeft=height[left];
             }else {
                 total+=maxLeft-height[left];
             }
             left++;
         }else {
             if (height[right]>=maxRight){
                 maxRight=height[right];
             }else {
                 total+=maxRight-height[right];
             }
             right--;
         }
      }
     return total;
    }






//this approach without using stack and takes TC-> O(3N) && SC-> O(2N)
//    static int trap(int[] height) {
//     int total =0;
//     int[] prefixMax = prefixHeights(height);
//     int[] sufixMax = sufixHeights(height);
//        for (int i = 0; i < height.length; i++) {
//            if(height[i]<prefixMax[i] && height[i]<sufixMax[i]){
//                total+= Math.min(prefixMax[i],sufixMax[i] )-height[i];
//            }
//        }
//
//     return total;
//    }
//
//     static int[] prefixHeights(int[] height){
//        int[] prefix =new int[height.length];
//
//        prefix[0] = height[0];
//         for (int i = 1; i < height.length ; i++) {
//             prefix[i]= Math.max(prefix[i-1],height[i] );
//         }
//         return prefix;
//     }
//
//    static int[] sufixHeights(int[] height){
//        int[] sufix =new int[height.length];
//
//        sufix[height.length-1] = height[height.length-1];
//        for (int i = height.length-2; i >=0 ; i--) {
//            sufix[i]= Math.max(sufix[i+1],height[i] );
//        }
//        return sufix;
//    }

}
