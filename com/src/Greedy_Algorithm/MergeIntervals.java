package Greedy_Algorithm;
//Given an array of intervals where intervals[i] = [starti, endi],
// merge all overlapping intervals, and return an array of the
// non-overlapping intervals that cover all the intervals in the input.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 2}, {5, 9}, {8, 10}, {15, 18}
        };
        int[][] result = merge(intervals);
        for (int[] inter:result){
            for (int val:inter){
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }
    static int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();

        if (intervals.length==0) return intervals;

        int [] current = intervals[0];

        for (int i = 1; i <intervals.length ; i++) {
            if (intervals[i][0]<=current[1]){
                current[1]=Math.max(current[1],intervals[i][1] );
            }
            else {
                result.add(current);
                current=intervals[i];
            }
        }
        result.add(current);

        return result.toArray(new int[result.size()][]);
    }
}
