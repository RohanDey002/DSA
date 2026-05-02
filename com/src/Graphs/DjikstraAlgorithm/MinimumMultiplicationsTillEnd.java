package Graphs.DjikstraAlgorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumMultiplicationsTillEnd {
    static int mod =1000;
    static void main(String[] args) {
        int[] arr = {3,4,65};
        System.out.println(minSteps(arr,7,175));

    }
    static int minSteps(int[] arr, int start, int end) {
        // code here
        Queue<int[]> que = new LinkedList<>();
        int[] result = new int[mod];
        Arrays.fill(result,Integer.MAX_VALUE);
        result[start]=0;
        que.offer(new int[]{start,0});
        while (!que.isEmpty()){
            int[] temp = que.poll();
            int node = temp[0];
            int step = temp[1];
            if(node==end) return step;

            for (int val : arr){
                int num = (val*node)%mod;
                if(step+1<result[num]){
                    result[num]=step+1;
                    que.offer(new int[]{num,step+1});
                }
            }
        }
        return -1;

    }
}
