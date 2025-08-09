package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] result = insert(intervals,newInterval);
        for (int[] inter:result){
           for (int val:inter){
               System.out.print(val+" ");
           }
            System.out.println();
        }
    }
    static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i=0;
        while (i<intervals.length && intervals[i][1]<newInterval[0]){
            result.add(intervals[i]);
            i++;
        }
        while (i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        result.add(newInterval);
        while (i<intervals.length){
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }

}
