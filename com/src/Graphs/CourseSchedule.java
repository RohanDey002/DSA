package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//leetcode--> 207
public class CourseSchedule {
    static void main(String[] args) {
             int[][] prerequisite = {
                     {0,1},
                     {1,0}

             };
        System.out.println(canFinish(2,prerequisite));
    }

    static boolean canFinish(int numCourses, int[][] prerequisites) {
        int finisCourse = 0;
        List<List<Integer>> adj = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        int[] vis = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
             int u  = prerequisites[i][0];
             int v = prerequisites[i][1];
             adj.get(u).add(v);
        }

        for (int i = 0; i < numCourses; i++) {
            for (Integer course : adj.get(i)){
                vis[course]++;
            }
        }

        for (int i = 0; i < numCourses; i++) {
            if(vis[i]==0) que.offer(i);
        }

        while (!que.isEmpty()){
            int val = que.poll();
            finisCourse++;
            for (Integer course : adj.get(val)){
                vis[course]--;
                if(vis[course]==0) que.offer(course);
            }
        }

          return finisCourse==numCourses;
    }
}
