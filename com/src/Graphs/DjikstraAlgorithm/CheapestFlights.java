package Graphs.DjikstraAlgorithm;
//Leetcode --> 787

import java.util.*;

public class CheapestFlights {
    static void main(String[] args) {
        int[][] flights = {
                {0, 1, 100},
                {1, 2, 100},
                {2, 0, 100},
                {1, 3, 600},
                {2, 3, 200}
        };
        int src =0;
        int dest = 3;
        int k = 2;
        System.out.println(findCheapestPrice(4,flights,src,dest,k));

    }

    static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> adj  = new ArrayList<>();
        int[] distance = new int[n];
        Queue<int[]> que = new LinkedList<>();
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] flight:flights){
            int origin = flight[0];
            int dest = flight[1];
            int price = flight[2];
            adj.get(origin).add(new int[]{dest,price});
        }
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[src]=0;
        que.offer(new int[]{src,0});
        int level =0;
        while (!que.isEmpty()&& level<=k){
            int size = que.size();
            for (int i = 0; i < size; i++) {
                int[] temp = que.poll();
                int node = temp[0];
                int dist = temp[1];
                for (int[] neighbour: adj.get(node)){
                    int vertex = neighbour[0];
                    int cost =neighbour[1];
                    if(distance[vertex]>dist+cost){
                        distance[vertex]=dist+cost;
                        que.offer(new int[]{vertex,dist+cost});
                    }
                }
            }
            level++;
        }

        return distance[dst]== Integer.MAX_VALUE? -1 : distance[dst];


    }
}
