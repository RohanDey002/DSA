package Heaps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;

public class KSortedArray {
    public static void main(String[] args) {
        int n=19;
        int []arr = {10, 27 ,13 ,28, 31 ,29, 15 ,7 ,30 ,19, 47, 49 ,25 ,2 ,20 ,43 ,44, 35, 12};
        int k = 12;
        System.out.println(isKSortedArray(arr,n,k));
    }
    static String isKSortedArray(int arr[], int n, int k) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        Map<Integer, Integer> posMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            posMap.put(sortedArr[i], i);
        }


        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < n; i++) {
            minHeap.add(new int[]{arr[i], i});
        }
        int sortedIndex = 0;
        while (!minHeap.isEmpty()) {
            int[] smallest = minHeap.poll();
            int originalIndex = smallest[1];
            int trueSortedIndex = posMap.get(smallest[0]);

            if (Math.abs(originalIndex - trueSortedIndex) > k) {
                return "No";
            }
            sortedIndex++;
        }

        return "Yes";

    }
}
