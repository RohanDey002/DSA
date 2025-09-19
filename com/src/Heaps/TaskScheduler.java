package Heaps;

//621. Task Scheduler

import java.util.*;

public class TaskScheduler {
    public static void main(String[] args) {
     char[] task = {'A','A','A','B','B','B'};
     int n =2;

        System.out.println(leastInterval(task,n));

    }

    static  int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

       for (char ch : tasks){
           freq[ch-'A']++;
       }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < 26; i++) {
            if(freq[i]>0) pq.offer(freq[i]);
        }
        int time =0;

        while (!pq.isEmpty()){
            int cycle = n+1;
            List<Integer> temp  = new ArrayList<>();
            int taskCount =0;
            while (cycle-->0 && !pq.isEmpty()){
                int currentFreq = pq.poll();
                if(currentFreq>1){
                    temp.add(currentFreq-1);
                }
                taskCount++;
            }

            temp.forEach(pq::offer);

            time+=pq.isEmpty()?taskCount:n+1;

        }

        return time;

    }
}
