package Greedy_Algorithm;

import java.util.Arrays;

public class MaxUnitsTruck {
    public static void main(String[] args) {
        int[][] boxtypes={
            {1,3},
            {2,2},
            {3,1}
        };
        int truckSize=4;
        System.out.println(maxUnits(boxtypes,truckSize));
    }

    static int maxUnits(int[][] boxTypes, int truckSize){
        int maxUnits=0;
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1] ));
        for (int i = 0; i < boxTypes.length; i++) {
            int boxes=boxTypes[i][0];
            int units=boxTypes[i][1];
            if (truckSize>= boxes){
                maxUnits+= boxes*units;
                truckSize-= boxes;
            }else {
                maxUnits+=truckSize*units;
                truckSize=0;
                break;
            }
        }
        return maxUnits;
    }
}
