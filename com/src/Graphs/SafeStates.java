package Graphs;

import java.util.*;

public class SafeStates {
    static void main(String[] args) {
        int[][] graph = {
                {1,2,3,4},
                {1,2},
                {3,4},
                {0,4},
                {}
        };
        List<Integer> ans = eventualSafeNodes(graph);
        for (Integer val: ans){
            System.out.println(val);
        }
    }


    static List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
       List<Integer> result = new ArrayList<>();
       List<List<Integer>> adj = new ArrayList<>();
       Queue<Integer> que = new LinkedList<>();
       int[] vis = new int[n];
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                adj.get(graph[i][j]).add(i);
            }
        }
        for (int i = 0; i < n; i++) {
            for (Integer val : adj.get(i)){
                vis[val]++;
            }
        }
        for (int i = 0; i < n; i++) {
            if(vis[i]==0) que.offer(i);
        }
        while (!que.isEmpty()){
            int node = que.poll();
            result.add(node);
            for (Integer val : adj.get(node)){
                vis[val]--;
                if(vis[val]==0) que.offer(val);
            }
        }

         Collections.sort(result);

       return result;
    }
}
