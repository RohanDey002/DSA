package Graphs.DjikstraAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DjikstraUndirectedGraph {
    static void main(String[] args) {
        int[][] edges = {
                {0, 1, 9},

        };
        int[] result = dijkstra(2,edges,1);
        for (int val : result){
            System.out.println(val);
        }

    }
    static int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        int n = edges.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        List<List<int[]>> adj = new ArrayList<>();
        int[] result = new int[V];
        Arrays.fill(result, Integer.MAX_VALUE);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i <n ; i++) {
            int vertex1 = edges[i][0];
            int vertex2 = edges[i][1];
            int weight = edges[i][2];
            adj.get(vertex1).add(new int[]{vertex2,weight});
            adj.get(vertex2).add(new int[]{vertex1,weight});
        }
        result[src]=0;
        pq.offer(new int[]{src,0});
        while (!pq.isEmpty()){
            int[] tem = pq.poll();
            int node = tem[0];
            int dist = tem[1];
            for (int[] curr : adj.get(node)){
                int w = curr[1];
                int v = curr[0];
                if(w+dist < result[v]){
                    result[v]= w+dist;
                    pq.offer(new int[]{v,w+dist});
                }
            }

        }

         return result;

    }
}
