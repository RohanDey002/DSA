package Graphs;

import java.util.ArrayList;
import java.util.List;

//Graph representation using arraylist
public class GraphReprsentation {
    static void main(String[] args) {
        representGraph(4);

    }
    static void representGraph(int v){
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <=v ; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(4);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(3).add(2);
        adj.get(4).add(1);
        adj.get(4).add(3);
        adj.get(4).add(2);
        adj.get(2).add(3);
        adj.get(2).add(4);

        for (int i = 1; i <=v; i++) {
            System.out.println("for vertex->"+i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j)+" ");

            }
            System.out.println(" ");
        }
    }
}
