package Graphs.DjikstraAlgorithm;

import java.util.*;

public class SortedDistanceUndirectedDistance {
    static void main(String[] args) {
        int[][] edges ={
                {0,1},
                {0,3},
                {1,4},
                {3,4},
                {3,2}
        };
        int n = 5;
        int m = 6;
        int src =0;
        int [] result = findPath(n,m,edges,0);
        for (int val : result){
            System.out.print(val+" ");
        }
    }

    static int[] findPath(int n , int m , int[][] edges , int src){
        int[] result = new int[n];
        Arrays.fill(result,Integer.MAX_VALUE);
        List<List<Integer>> adj = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1] );
            adj.get(edge[1]).add(edge[0] );
        }
        result[src]=0;
        que.offer(src);
        while (!que.isEmpty()){
            int node = que.poll();
            for (Integer neighbour: adj.get(node)){
                if(result[node]+1<result[neighbour]){
                    result[neighbour]=result[node]+1;
                    que.offer(neighbour);
                }
            }
        }

        return result;
    }
}
