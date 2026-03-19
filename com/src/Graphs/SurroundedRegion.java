package Graphs;
//Leetcode --> 130
public class SurroundedRegion {
    static void main(String[] args) {
        char[][] mat = {
                {'X','X','X','X'},
                {'X','O','X','X'},
                {'X','O','O','X'},
                {'X','O','X','X'},
                {'X','X','O','O'}
        };
        char[][] result = solve(mat);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]+",");
            }
            System.out.println();
        }

    }
    static char[][] solve(char[][] board) {
          int m = board.length;
          int n = board[0].length;
          int[][] visitedMat = new int[m][n];

        for (int i = 0; i < m; i++) {
            if(visitedMat[i][0]==0 && board[i][0]=='O') dfs(i,0,visitedMat,board,m,n);
            if(visitedMat[i][n-1]==0 && board[i][n-1]=='O') dfs(i,n-1,visitedMat,board,m,n);
        }
        for (int j = 0; j < n; j++) {
            if(visitedMat[0][j]==0 && board[0][j]=='O') dfs(0,j,visitedMat,board,m,n);
            if(visitedMat[m-1][j]==0 && board[m-1][j]=='O') dfs(m-1,j,visitedMat,board,m,n);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visitedMat[i][j]==0 && board[i][j]=='O') board[i][j]='X';
            }
        }
        return board;
    }

    static void dfs(int i , int j,  int[][] visitedMat,char[][] board , int m,int n){
        if(i>=0 && i<m && j >=0 && j<n && visitedMat[i][j]==0 && board[i][j]=='O'){
            visitedMat[i][j]=1;
            dfs(i+1,j,visitedMat,board,m,n);
            dfs(i-1,j,visitedMat,board,m,n);
            dfs(i,j+1,visitedMat,board,m,n);
            dfs(i,j-1,visitedMat,board,m,n);
        }

    }

}
