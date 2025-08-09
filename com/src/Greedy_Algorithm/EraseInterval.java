package Greedy_Algorithm;
//Given an array of intervals intervals where intervals[i] = [starti, endi],
// return the minimum number of intervals you need to remove to make the rest
// of the intervals non-overlapping.
//
//Note that intervals which only touch at a point are non-overlapping.
// For example, [1, 2] and [2, 3] are non-overlapping

import java.util.Arrays;

public class EraseInterval {
    public static void main(String[] args) {
        int [][] intervals = {{6,8},{1,5}};
        System.out.println(eraseOverlapIntervals(intervals));
    }

    static int eraseOverlapIntervals(int[][] intervals) {
            int count =0 ;
            if (intervals.length==0) return count;

            Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
            int [] lastElemnet = intervals[0];
        for (int i =1 ; i <intervals.length ; i++) {
            if(lastElemnet[1]>intervals[i][0]){
                count+=1;
            }
            else {
                lastElemnet=intervals[i];
            }
        }
        return count;
    }
}
