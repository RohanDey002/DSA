package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopoSortBFS {
    static void main(String[] args) {
        int[][] edges = {
                {1, 3},
                {2, 3},
                {4, 1},
                {4, 0},
                {5, 0},
                {5, 2}
        };

    }

    static ArrayList<Integer> topoSort(int V, int[][] edges) {

        List<List<Integer>> adj = new ArrayList<>();
        int[] vis = new int[V];
        Queue<Integer> que = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            int  u = edges[i][0];
            int vertex = edges[i][1];
            adj.get(u).add(vertex);
        }

        for (int i = 0; i < V; i++) {
            for(Integer vertices: adj.get(i)){
                vis[vertices]++;
            }
        }

        for (int i = 0; i < V; i++) {
            if(vis[i]==0) que.offer(i);
        }
        while (!que.isEmpty()){
            int val = que.peek();
            result.add(val);
            que.poll();
            for (Integer vertices: adj.get(val)){
                vis[vertices]--;
                if (vis[vertices]==0) que.offer(vertices);
            }
        }
        return result;
        
    }
}
