package Graphs;


import java.util.ArrayList;
import java.util.List;

// Detect Cycle in graph using dfs
public class DetectCycleInGraph {
    static void main(String[] args) {
        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 3}
        };
        System.out.println(isCycle(4,edges));


    }
    static boolean isCycle(int V, int[][] edges) {
        // Code here
        List<List<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                if (dfs(i,-1,visited,adj)) return true;
            }
        }
         return false;
    }
    static boolean dfs(int node , int parent,boolean[] visited , List<List<Integer>> adj){
        visited[node]=true;
        for (Integer val : adj.get(node)){
            if(!visited[val]){
                if(dfs(val,node,visited,adj)) return true;
            } else if (val!=parent) return true;
        }
        return false;
    }
}
