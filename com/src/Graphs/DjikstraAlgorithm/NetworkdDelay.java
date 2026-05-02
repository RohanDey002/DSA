package Graphs.DjikstraAlgorithm;

import java.util.*;

public class NetworkdDelay {
    static void main(String[] args) {
        int[][] times = {
                {2, 1, 1},
                {2, 3, 1},
                {3, 4, 1}
        };
        int n =4;
        int k = 2;
        System.out.println(networkDelayTime(times,n,k));
    }

    static int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        Queue<int[]> que = new LinkedList<>();
        int[] costs = new int[n+1];
        Arrays.fill(costs,Integer.MAX_VALUE);

        for (int i = 0; i <=n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] connector:times){
            int node1= connector[0];
            int node2 = connector[1];
            int delayTime = connector[2];
            adj.get(node1).add(new int[]{node2,delayTime});
        }

        costs[k]=0;
        que.offer(new int[]{k,0});

        while (!que.isEmpty()){
            int[] temp = que.poll();
            int node = temp[0];
            int time = temp[1];
            for (int[] neighbour : adj.get(node)){
                int newNode= neighbour[0];
                int newTime = neighbour[1];
                if(costs[newNode]>time+newTime){
                    costs[newNode]=time+newTime;
                    que.offer(new int[]{newNode,time+newTime});
                }
            }
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 1; i <=n ; i++) {
            ans = Math.max(ans,costs[i]);
        }

        return ans== Integer.MAX_VALUE? -1:ans;


    }
}
