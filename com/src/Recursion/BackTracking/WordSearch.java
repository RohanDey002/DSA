package Recursion.BackTracking;

//Given an m x n grid of characters board and a string word, return true if the word exists in the grid.
// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are
// horizontally or vertically neighboring. The same letter cell may not be used more than once.

public class WordSearch {
    public static void main(String[] args) {
        char [][] board ={
                          {'A','B','C','E'},
                          {'S','F','C','S'},
                          {'A','D','E','E'}
                        };
        String word = "SCB";
        System.out.println(exist(board,word));
    }

    static  boolean exist(char[][] board, String word) {
        int m = board.length;
        int n= board[0].length;
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==word.charAt(index)){
                    if (findNext(board,word,index,i,j,m,n)){
                        return true;
                    }
                }
            }
        }
        return false;

    }
    static boolean findNext(char[][] board, String word,int index,int row,int col,int m,int n){
        if(index==word.length()) return true;
        if(row<0|| col<0 || row>=m || col>=n || board[row][col]!=word.charAt(index)||board[row][col]=='*'){
            return false;
        }
        char temp =  board[row][col];
        board[row][col]='*';
        boolean top = findNext(board,  word,index+1, row-1, col, m,n);
        boolean bottom = findNext(board,  word,index+1, row+1, col, m,n);
        boolean left= findNext(board,  word,index+1, row, col-1, m,n);
        boolean right = findNext(board,  word,index+1, row, col+1, m,n);
        board[row][col]=temp;
        return top || bottom|| left|| right;
    }

}
