package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Topological Sort using DFS
public class TopoSortDFS {
    static void main(String[] args) {
        int[][] edges = {
                {1, 3},
                {2, 3},
                {4, 1},
                {4, 0},
                {5, 0},
                {5, 2}
        };
        ArrayList<Integer> result = topoSort(6,edges);
        for(Integer it : result){
            System.out.print(it+" ");
        }
    }

    static ArrayList<Integer> topoSort(int V, int[][] edges) {
        int n = edges.length;

        List<List<Integer>> adj = new ArrayList<>();
        boolean[] vist = new boolean[V];
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer>result = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
             int u = edges[i][0];
             int vertex = edges[i][1];
             adj.get(u).add(vertex);
        }
        for (int i = 0; i < V; i++) {
            if(!vist[i]){
                dfs(adj,i,vist,st);
            }
        }
        while (!st.isEmpty()){
            result.add(st.peek());
            st.pop();
        }
        return result;

    }

    static void dfs(List<List<Integer>>adj , int node , boolean[] vist , Stack<Integer>st){
        vist[node]=true;
        for (Integer val:adj.get(node)){
            if(!vist[val]){
                dfs(adj,val,vist,st);
            }
        }
        st.push(node);
    }
}
