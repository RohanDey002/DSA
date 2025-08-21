package Stack_Queue.Stack;

import java.util.Stack;

public class MonotonicStack {
    public static void main(String[] args) {
        int[] arr = {3,6,4,1,5};
        int[] result = monotonic(arr);
        for (int val : result){
            System.out.println(val);
        }
    }

    static int[] monotonic(int[] arr){
        Stack<Integer> st = new Stack<>();
           int [] nge = new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            while (!st.isEmpty() && arr[i]>=st.peek()){
                st.pop();
            }
            if (st.isEmpty()) nge[i]=-1;
            else nge[i]=st.peek();

            st.push(arr[i]);
        }
        return nge;
    }
}
