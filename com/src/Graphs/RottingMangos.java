package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottingMangos {
    static int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    static void main(String[] args) {
        int[][] grid = {
                {1, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        System.out.println(orangesRotting(grid));
    }
    static int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [][] valid = new int[m][n];
        Queue<int[]> que = new LinkedList<>();
        int freshcount=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j]==2){
                    que.offer(new int[]{i,j,0});
                    valid[i][j]=1;
                }
                if (grid[i][j]!=0) freshcount++;
            }
        }
        if(freshcount==0) return 0;
        int time =0 ;
        int tm=0;
        while (!que.isEmpty()){
            int[] temp = que.poll();
            int i = temp[0];
            int j = temp[1];
            int t = temp[2];
            tm = Math.max(tm,t);
            for(int[] dir: directions){
                int new_i = i+dir[0];
                int new_j = j+dir[1];
                if(new_i>=0 && new_i<m && new_j>=0 && new_j<n &&
                        grid[new_i][new_j]==1 && valid[new_i][new_j]==0){
                    que.offer(new int[]{new_i,new_j,tm+1});
                    valid[new_i][new_j ]=1;
                }

            }
            time++;
        }
        return freshcount!=time? -1: tm;
    }
}
