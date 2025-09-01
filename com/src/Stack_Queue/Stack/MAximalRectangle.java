package Stack_Queue.Stack;


//Leetcode ->85. Maximal Rectangle

import java.util.Stack;

public class MAximalRectangle {
    public static void main(String[] args) {
        char[][] matrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        System.out.println(maximalRectangle(matrix));
    }
    static int maximalRectangle(char[][] matrix) {
        int maxArea=0;

        int n = matrix.length;
        int m =matrix[0].length;
        int[][] pseMatrix = new int[n][m];
        for(int j=0;j<m;j++){
            int sum =0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j]=='1'){
                    sum+=1;
                }else sum=0;

                pseMatrix[i][j]=sum;
            }
        }
        for (int i = 0; i < n; i++) {
            maxArea=Math.max(maxArea,findArea(pseMatrix[i]));
        }

        return maxArea;
    }

    static int findArea(int[] arr){
        int n=arr.length;
        int area =0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()]>=arr[i]){
                int height = arr[st.peek()];
                st.pop();
                int nse =i;
                int pse = st.isEmpty()?-1:st.peek();
                area=Math.max(area,height*(nse-pse-1));

            }
            st.push(i);
        }
        while (!st.isEmpty()){
            int height = arr[st.peek()];
            st.pop();
            int nse = n;
            int pse = st.isEmpty()?-1:st.peek();
            area=Math.max(area,height*(nse-pse-1));
        }
        return area;
    }
}
