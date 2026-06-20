package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Leetcode -->210
public class CourseSchedule2 {
    static void main(String[] args) {
        int numCourse = 4;
        int[][] preRequisite ={
                {1,0},
                {2,0},
                {3,1},
                {3,2}
        };
        int[] result = findOrder(numCourse,preRequisite);
        for(Integer val: result){
            System.out.println(val);
        }
    }

    static int[] findOrder(int numCourses, int[][] prerequisites) {
        int n = prerequisites.length;
        List<List<Integer>> adj = new ArrayList<>();
        int[] vis = new int[numCourses];
        List<Integer> result = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i <n ; i++) {
            int u = prerequisites[i][1];
            int v = prerequisites[i][0];
            adj.get(u).add(v);
        }

        for (int i = 0; i < numCourses ; i++) {
             for(Integer course : adj.get(i)){
                 vis[course]++;
             }
        }
        for (int i = 0; i < numCourses; i++) {
            if(vis[i]==0) que.offer(i);
        }

        while (!que.isEmpty()){
            int val = que.poll();
            result.add(val);
            for (Integer course : adj.get(val)){
                vis[course]--;
                if(vis[course]==0) que.offer(course);
            }
        }
           if(result.size()==numCourses) return result.stream().mapToInt(i->i).toArray();

        return new int[]{};
    }
}
