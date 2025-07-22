package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
     List<List<String>> queen = solveQueen(4);
        int i = 1;
        for (List < String > it: queen) {
            System.out.println("Arrangement " + i);
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }
    }

// Here, we will use hashing to maintain a list to check whether that position can bethe right one or not.
    static List<List<String>> solveQueen(int n){
        char[][] board = new char[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='.';

            }
        }
        int leftRow  [] = new int[n];
        int upperDiagonal[] = new int[2*n-1];
        int lowerDiagonal[] = new int[2*n-1];
        List<List<String>> res = new ArrayList<>();
        solve(0,board,leftRow,upperDiagonal,lowerDiagonal,res);
      return res;
    }

    static void solve(int col,char[][] board,int[] leftRow,int[] upperDiagonal,
                      int[] lowerDiagonal, List<List<String>> res){
        if (col== board.length){
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (leftRow[row]==0 && upperDiagonal[row+col]==0 && lowerDiagonal[board.length-1+col-row]==0){
                board[row][col]='Q';
                leftRow[row]=1;
                upperDiagonal[row+col]=1;
                lowerDiagonal[board.length-1+col-row]=1;
                solve(col+1,board,leftRow,upperDiagonal,lowerDiagonal,res);
                board[row][col]='.';
                leftRow[row]=0;
                upperDiagonal[row+col]=0;
                lowerDiagonal[board.length-1+col-row]=0;
            }
        }

    }
    static List < String > construct(char[][] board) {
        List < String > res = new ArrayList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
