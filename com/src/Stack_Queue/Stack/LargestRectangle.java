package Stack_Queue.Stack;


//Leetcode-> 84. Largest Rectangle in Histogram

//Given an array of integers heights representing the histogram's bar height where the width
// of each bar is 1, return the area of the largest rectangle in the histogram.

import java.util.Stack;

public class LargestRectangle {
    public static void main(String[] args) {
        int[]heigts ={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heigts));
    }

    static int largestRectangleArea(int[] heights) {
      int maxArea= 0;
      int n = heights.length;
        Stack<Integer> st =new Stack<>();
        for (int i = 0; i <n; i++) {
            while (!st.isEmpty() && heights[st.peek()]>= heights[i]){
                int heigth = heights[st.peek()];
                st.pop();
                int nse=i;
                int pse = st.isEmpty()?-1:st.peek();
                maxArea=Math.max(maxArea,heigth*(nse-pse-1));
            }
            st.push(i);
        }
        while (!st.isEmpty()){
            int height = heights[st.peek()];
            st.pop();
            int nse = n;
            int pse = st.isEmpty()?-1:st.peek();
            maxArea=Math.max(maxArea,height*(nse-pse-1));
        }

      return maxArea;
    }
}
