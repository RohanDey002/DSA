package Stack_Queue.Stack;
import   java.util.Stack;
public class MaxSubarraySum {
    public static void main(String[] args) {
        int [] arr = {3,1,2,4};
        System.out.println(sumSubarrayMax(arr));
    }
    static int sumSubarrayMax(int[] arr) {
        long MOD = 1_000_000_007;
        int[] nge = findNGE(arr);
        int[] pge = findPGE(arr);
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int left = i - pge[i];
            int right = nge[i] - i;
            sum = (sum + (left * 1L * right % MOD) * arr[i] % MOD) % MOD;
        }
        return (int) sum;
    }
    static int[] findPGE(int[] arr) {
        int n = arr.length;
        int[] pge = new int[n];
      Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) st.pop();
            pge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pge;
    }

    static int[] findNGE(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) st.pop();
            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nge;
    }
}
