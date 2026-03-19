package Graphs;

import java.util.ArrayList;
import java.util.List;

public class NumberOfProvinces {
    static void main(String[] args) {
        int[][] matrix = {
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };
        System.out.println(findCircleNum(matrix));

    }
    //T.C--> O(n)+O(v+E)
    static int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <v; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i <v; i++) {
            for (int j = 0; j < v; j++) {
                if(isConnected[i][j]==1){
                    adj.get(i).add(j);
                }
            }
        }
        boolean[] vis = new boolean[v];
        int count=0;
        for (int i = 0; i < v; i++) {
            if(vis[i]==false){
                count++;
                dfs(adj,vis,i);
            }
        }
        return count;
    }
    static void dfs(List<List<Integer>> adj , boolean[] vis,int n){
        vis[n] = true;
        for (Integer it : adj.get(n)){
            if(vis[it]==false){
                dfs(adj,vis,it);
            }
        }
    }
    //T.C--> O(n^2)
//   static int findCircleNum(int[][] isConnected) {
//        int n = isConnected.length;
//        boolean[] visited = new boolean[n];
//
//        int provinces=0;
//        for(int i=0;i<n;i++){
//            if(!visited[i]){
//                dfs(i,isConnected,visited);
//                provinces++;
//            }
//        }
//
//        return provinces;
//    }
//
//    static void dfs(int node,int[][] isConnected,boolean[] visited){
//        visited[node]=true;
//
//        for(int i=0;i<isConnected.length;i++){
//            if(isConnected[node][i]==1 && !visited[i]){
//                dfs(i,isConnected,visited);
//            }
//        }
//    }
}
