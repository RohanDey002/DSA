package Arrays;

import java.util.HashSet;
import java.util.Set;

//It's a program  to find longest consecutive sequence in array
public class ConsecuitveSequence {
    public static void main(String[] args) {
        int[] arr ={1,101,4,103,3,102};
        System.out.println("Longest sequence is: "+longsequnce(arr));
    }


    static int longsequnce (int[] nums){
        int n = nums.length;
        if(n==0) return 0;

        int longest=1;
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i <n ; i++) {
            st.add(nums[i]);
        }

        for (int it:st){
            if (!st.contains(it-1)){
                int x = it;
                int ctn =1;
                while (st.contains(x+1)){
                    x = x+1;
                    ctn = ctn+1;
                }
                longest = Math.max(ctn,longest);
            }
        }

        return longest;
    }
}

