package Stack_Queue.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] M = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 1, 0}
        };

        System.out.println(celebrity(M));
    }

    static int celebrity(int mat[][]) {
        int top =0;
        int down = mat.length-1;

        while (top<down){
            if(mat[top][down]==1){
                top++;
            }else {
                down--;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            if (i==top) continue;
            if(mat[top][i]==1 || mat[i][top]==0) return -1;
        }
         return top;
    }
}
