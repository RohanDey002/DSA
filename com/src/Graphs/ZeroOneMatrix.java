package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {
   static int[][] directions = {{0,-1},{0,1},{-1,0},{1,0}};

    static void main(String[] args) {
        int[][] mat={
                {0,1,0},
                {0,1,0},
                {1,1,1}
        };
        int [][] answer = updateMatrix(mat);
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }

    }
    static int[][] updateMatrix(int[][] mat) {
          int m = mat.length;
          int n = mat[0].length;
          int[][] result = new int[m][n];
        Queue<int[]> que = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j]==0){
                    result[i][j]=0;
                    que.offer(new int[]{i,j});
                }else {
                    result[i][j]=-1;
                }
            }
        }
        while (!que.isEmpty()){
            int [] cell = que.poll();
            int i = cell[0];
            int j =  cell[1];
            for (int[] moves : directions){
                int new_i = i+moves[0];
                int new_j = j+moves[1];
                if(new_i<m && new_i>=0 && new_j<n && new_j>=0 && result[new_i][new_j]==-1){
                    result[new_i][new_j]= result[i][j]+1;
                    que.add(new int[] {new_i,new_j});
                }
            }

        }

      return result;
    }
}
