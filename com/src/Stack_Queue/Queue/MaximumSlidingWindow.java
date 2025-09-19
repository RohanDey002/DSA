package Stack_Queue.Queue;
//239. Sliding Window Maximum
//
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class MaximumSlidingWindow {
    public static void main(String[] args) {

        int[] arr ={1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] answer = maxSlidingWindow(arr,k);
        for (int val:answer){
            System.out.println(val);
        }

    }

    static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int [] res = new int[nums.length-k+1];
        int ind =0;
        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && dq.peek()<=i-k){
                dq.poll();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()]<= nums[i]){
                dq.pollLast();
            }

            dq.offer(i);
            if(i>=k-1){
                res[ind] = nums[dq.peek()];
                ind++;
            }
        }


        return res;
    }
}
