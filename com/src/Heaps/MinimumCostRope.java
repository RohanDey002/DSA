package Heaps;

import java.util.PriorityQueue;

public class MinimumCostRope {
    public static void main(String[] args) {
        int[] arr = {2,4,7,3,9};

        System.out.println(minCost(arr));
    }
    static int minCost(int[] arr) {
        int cost =0 ;
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.offer(arr[i]);
        }

        while (pq.size()>1){
            int firstValue = pq.peek();
            pq.poll();
            int secondValue= pq.peek();
            pq.poll();
            cost=cost+(firstValue+secondValue);
            pq.offer(firstValue+secondValue);
        }
         return cost;
    }
}
