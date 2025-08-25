package Stack_Queue.Stack;

import java.util.Stack;

public class MinSubarraySum {
    public static void main(String[] args) {
        int [] arr = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }

    static int sumSubarrayMins(int[] arr) {
        long MOD = 1_000_000_007;
      int[] nse = findNSE(arr);
      int[] pse = findPSE(arr);
      long sum=0;
        for (int i = 0; i < arr.length; i++) {
            int left =i-pse[i];
            int right = nse[i]-i;
            sum = (sum + (left * 1L * right % MOD) * arr[i] % MOD) % MOD;

        }
      return (int) sum;

    }

    static int[] findPSE(int[] arr){
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }

            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return pse;
    }

    static int[] findNSE(int[] arr){
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n-1; i >=0; i--) {
            while (!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return nse;
    }
}
