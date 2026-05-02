package Graphs.DjikstraAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathBinaryMaze {
    static int[][] directions = {{1,1}, {0,1},{1,0},{0,-1},{-1,0},{-1, -1},{1, -1},{-1, 1}};
    static void main(String[] args) {
        int[][] grid = {
                {0,0,0},
                {1,1,0},
                {1,1,0}
        };
        System.out.println(shortestPathBinaryMatrix(grid));


    }

    static int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> que = new LinkedList<>();
        int[][] result = new int[n][m];

        if(grid[0][0]!=0) return -1;
        result[0][0]=1;
        que.offer(new int[]{0,0,1});
        while (!que.isEmpty()){
            int[] temp = que.poll();
            int x = temp[0];
            int y = temp[1];
            int d = temp[2];
            for (int[] dir: directions){
                int x_ = x+dir[0];
                int y_ = y+dir[1];

                if(x_>=0 && x_<n && y_>=0 && y_<m && grid[x_][y_]==0 && result[x_][y_]==0){
                    que.offer(new int[]{x_,y_,d+1});
                    result[x_][y_]=d+1;
                }
            }

        }

        return result[n-1][m-1] ==0 ? -1: result[n-1][m-1];

    }
}
