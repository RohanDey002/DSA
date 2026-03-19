package Graphs;

//Leetcode--->1020
public class NumberOfEnclaves {
    static void main(String[] args) {
        int[][] grid = {
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        };
        System.out.println(numEnclaves(grid));

    }

    static int numEnclaves(int[][] grid) {
     int m = grid.length;
     int n = grid[0].length;
     int[][] visited = new int[m][n];
     int count =0;
        for (int i = 0; i < m; i++) {
            if(visited[i][0]==0 && grid[i][0]==1) dfs(i,0,m,n,visited,grid);
            if(visited[i][n-1]==0 && grid[i][n-1]==1) dfs(i,n-1,m,n,visited,grid);
        }

        for (int j = 0; j < n; j++) {
            if(visited[0][j]==0 && grid[0][j]==1) dfs(0,j,m,n,visited,grid);
            if(visited[m-1][j]==0 && grid[m-1][j]==1) dfs(m-1,j,m,n,visited,grid);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(visited[i][j]==0 && grid[i][j]==1) count++;
            }
        }

        return count;
    }

    static void dfs(int i,int j , int m,int n,int[][] visited,int[][] grid){
        if(i>=0 && i<m && j>=0 && j<n && visited[i][j]==0 && grid[i][j]==1){
            visited[i][j]=1;
            dfs(i+1,j,m,n,visited,grid);
            dfs(i-1,j,m,n,visited,grid);
            dfs(i,j+1,m,n,visited,grid);
            dfs(i,j-1,m,n,visited,grid);
        }
    }

}
