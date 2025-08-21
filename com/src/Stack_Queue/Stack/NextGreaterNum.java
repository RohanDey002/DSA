package Stack_Queue.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterNum {
    public static void main(String[] args) {
        int[] nums1= {4,1,2};
        int [] nums2 ={1,3,4,2};
        int[] result = nextGreaterElement(nums1,nums2);
        for(int val: result){
            System.out.println(val);
        }
    }
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mpp = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int[] result = new int[nums1.length];
        for (int i = nums2.length-1; i >=0 ; i--) {
            while (!st.isEmpty()&&nums2[i]>=st.peek()){
                st.pop();
            }

            if (st.isEmpty()) mpp.put(nums2[i],-1);
            else mpp.put(nums2[i],st.peek() );
            st.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            result[i]= mpp.get(nums1[i]);
        }
        return result;
    }
}
