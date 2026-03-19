package Graphs;

public class NumberOfIsland {
    static void main(String[] args) {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        System.out.println(numIslands(grid));

    }

    static int numIslands(char[][] grid) {
         int m = grid.length;
         int n = grid[0].length;
         int island =0 ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j]=='1'){
                    island++;
                    dfs(grid,m,n,i,j);
                }
            }
        }
        return island;
    }
    static void dfs(char[][] grid , int m , int n , int row ,  int col){
        if(row<0 || row>=m || col<0 || col>=n || grid[row][col]!='1') return;

        grid[row][col] = '$';

        dfs(grid,m,n,row+1,col);
        dfs(grid,m,n,row-1,col);
        dfs(grid,m,n,row,col+1);
        dfs(grid,m,n,row,col-1);
    }
}
