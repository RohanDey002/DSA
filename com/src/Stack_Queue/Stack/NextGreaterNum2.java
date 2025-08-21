package Stack_Queue.Stack;

import java.util.Stack;

public class NextGreaterNum2 {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,3};
        int [] result = nextGreaterElements(nums);
        for (int val:result){
            System.out.println(val);
        }
    }
    static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];

        for (int i = 2*n-1 ; i >=0; i--) {
            while (!st.isEmpty() && nums[i%n]>=st.peek()){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()) nge[i]=-1;
                else nge[i]=st.peek();
            }
            st.push(nums[i%n]);
        }
        return nge;
    }
}
