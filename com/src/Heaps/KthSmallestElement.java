package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int [] nums = {3,1,6,4};
        int k = 2;
        System.out.println(findSmallest(nums,k));
    }
    static int findSmallest(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int val:nums){
            pq.add(val);
            if (pq.size()>k){
                pq.poll();
            }
        }
       return pq.peek();
    }
}
