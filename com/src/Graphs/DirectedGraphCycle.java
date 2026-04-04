package Graphs;

//Detect Cycle in directed graph using Topological sort and kahn algorithm

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DirectedGraphCycle {
    static void main(String[] args) {
        int[][] edges ={
                {0,1},
                {1,2},
                {2,3},
                {3,4},
                {4,2},
                {3,5}

        };

        System.out.println(isCycle(6,edges));
    }
    static boolean isCycle(int v , int[][] edges){

        int count = 0;
        List<List<Integer>> adj = new ArrayList<>();
        int[]vis = new int[v];
        Queue<Integer> que = new LinkedList<>();

        for (int i = 0; i<v;i++){
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length ; i++) {
            int u = edges[i][0];
            int vertex = edges[i][1];
            adj.get(u).add(vertex);
        }

        for (int i = 0; i <v; i++) {
            for (Integer ver : adj.get(i)){
                vis[ver]++;
            }
        }

        for (int i = 0; i <v ; i++) {
            if (vis[i]==0) que.offer(i);
        }

        while (!que.isEmpty()){
            int val = que.poll();
            count++;
            for (Integer ver: adj.get(val)){
                vis[ver]--;
                if(vis[ver]==0) que.offer(ver);
            }
        }
        return count!=v;
    }
}
