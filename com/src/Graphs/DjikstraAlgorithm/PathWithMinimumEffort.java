package Graphs.DjikstraAlgorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PathWithMinimumEffort {
    static int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
    static void main(String[] args) {
        int[][] heights = {
                {1, 2, 2},
                {3, 8, 2},
                {5, 3, 5}
        };
        System.out.println(minimumEffortPath(heights));
    }

    static int minimumEffortPath(int[][] heights) {
         int m = heights.length;
         int n = heights[0].length;
        Queue<int[]> que = new LinkedList<>();

         int[][] result = new int[m][n];
         for (int[] row : result) {
             Arrays.fill(row, Integer.MAX_VALUE);
         }
        result[0][0]=0;
        que.offer(new int[]{0,0,0});

        while (!que.isEmpty()){
            int[] temp = que.poll();
            int diff = temp[0];
            int x = temp[1];
            int y = temp[2];
            for (int[] dir:directions){
                int x_=x+dir[0];
                int y_ = y+dir[1];
                if (x_>=0 && x_<m && y_>=0 && y_<n) {
                    int newDiff =Math.max( Math.abs(heights[x][y] - heights[x_][y_]),diff);
                    if (result[x_][y_] > newDiff) {
                        result[x_][y_] = newDiff;
                        que.offer(new int[]{newDiff, x_, y_});
                    }
                }
            }
        }
            return result[m-1][n-1];

    }
}
