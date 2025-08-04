package Greedy_Algorithm;

import java.util.Arrays;

public class Nmeetings {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] =  {2,4,5,7,9,9};
        System.out.println(findMaxMeeting(start,end));
    }

    static int findMaxMeeting(int[] start,int[] end){
        int n= start.length;
        int maxMeeting=0;
        int lastEndime=-1;
        int [][] meetings = new int[n][2];
        for (int i = 0; i < start.length; i++) {
            meetings[i][0]=start[i];
            meetings[i][1]=end[i];

        }
        Arrays.sort(meetings,(a,b)->Integer.compare(a[1],b[1]));
        for (int i = 0; i < meetings.length; i++) {
            if (meetings[i][0]>lastEndime){
                maxMeeting+=1;
                lastEndime=meetings[i][1];
            }

        }
        return maxMeeting;
    }
}
