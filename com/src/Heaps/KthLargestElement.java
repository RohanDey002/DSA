package Heaps;

import java.util.PriorityQueue;

//215. Kth Largest Element in an Array
//
public class KthLargestElement {
    public static void main(String[] args) {
        int [] nums = {3,2,1,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));
    }
    static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for (int val: nums){
            minheap.add(val);
            if(minheap.size()>k){
                minheap.poll();  //  ----- space complexity O(k)
            }
        }
//        while (minheap.size()>k){
//            minheap.poll(); ----- space complexity O(n)
//        }
        return minheap.peek();
    }

}
