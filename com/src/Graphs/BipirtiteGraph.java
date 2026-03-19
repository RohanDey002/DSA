package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BipirtiteGraph {
    static void main(String[] args) {
        int[][] graph = {
                {1, 2, 3},
                {0, 2},
                {0, 1, 3},
                {0, 2}
        };
        System.out.println(isBipartite(graph));
    }

    static boolean isBipartite(int[][] graph) {
         int v = graph.length;

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                adj.get(i).add(graph[i][j]);
            }
        }
        int[] color = new int[v];
        Arrays.fill(color,-1);
        for (int i = 0; i < v; i++) {
            if(color[i]==-1){
                if(dfs(adj,i,color,1)==false) return false;
            }

        }
        return true;
    }
    static boolean dfs(List<List<Integer>> adj , int node , int[] color , int curColor){
        color[node]=curColor;
        for (Integer v : adj.get(node)){
                 if(color[v]==curColor) return false;
                 if(color[v]==-1){
                     int colorV= 1-curColor;
                     if(dfs(adj,v,color,colorV)==false) return false;
                 }
        }
        return true;
    }
}
