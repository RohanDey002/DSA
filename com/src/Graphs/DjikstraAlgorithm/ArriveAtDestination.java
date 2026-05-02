package Graphs.DjikstraAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

//No of ways to arrive at destination ---[Leetcode :1976]
public class ArriveAtDestination {
    static int MOD = 1000000007;
    static void main(String[] args) {
        int[][] roads = {
                {0, 6, 7},
                {0, 1, 2},
                {1, 2, 3},
                {1, 3, 3},
                {6, 3, 3},
                {3, 5, 1},
                {6, 5, 1},
                {2, 5, 1},
                {0, 4, 5},
                {4, 6, 2}
        };
        System.out.println(countPaths(7,roads));
    }

    static int countPaths(int n, int[][] roads) {
        List<List<int[]>> adj = new ArrayList<>();
        PriorityQueue<long[]> pq = new PriorityQueue<>((a,b)->Long.compare(a[1],b[1]));
        long[] result = new long[n];
        int[] pathcount = new int[n];
        Arrays.fill(result,Long.MAX_VALUE);
        Arrays.fill(pathcount,0);
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] road:roads) {
           int u = road[0];
           int v = road[1];
           int time = road[2];
           adj.get(u).add(new int[]{v,time});
           adj.get(v).add(new int[]{u,time});
        }
        result[0]=0;
        pathcount[0]=1;
        pq.offer(new long[]{0,0});
        while (!pq.isEmpty()){
            long[] temp = pq.poll();
            int node = (int)temp[0];
            long time = temp[1];
            for(int[] adjRoad : adj.get(node)){
                int adjNode = adjRoad[0];
                int roadTime = adjRoad[1];
                if(time+roadTime< result[adjNode]){
                    result[adjNode]=time+roadTime;
                    pathcount[adjNode]=pathcount[node];
                    pq.offer(new long[]{adjNode,result[adjNode]});
                } else if (time+roadTime==result[adjNode]) {
                    pathcount[adjNode] = (pathcount[adjNode]+pathcount[node]) % MOD;
                    
                }
            }
        }
           return pathcount[n-1] == 0 ? -1 : pathcount[n-1];

    }
}
