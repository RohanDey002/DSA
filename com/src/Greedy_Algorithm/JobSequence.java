package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class JobSequence {
    public static void main(String[] args) {
        int deadline[] = {4, 1, 1, 1};
        int profit[] = {20, 10, 40, 30};
        ArrayList<Integer> result = findMaxProfit(deadline,profit);
        for (int val:result){
            System.out.println(val);
        }
    }

    static ArrayList<Integer> findMaxProfit(int[] deadline , int[] profit){
        int n = deadline.length;
        int maxDay=0;
        int[][] sequence = new int[n][2];
        for (int i = 0; i < deadline.length; i++) {
            maxDay=Math.max(maxDay,deadline[i]);
            sequence[i][0]=deadline[i];
            sequence[i][1]=profit[i];
        }

        int[] result = new int[maxDay+1];
        Arrays.fill(result,-1);

        int maxProfit=0;
        int count=0;
        Arrays.sort(sequence,(a,b)->Integer.compare(b[1],a[1] ));
        for (int i = 0; i < sequence.length; i++) {
            int j = sequence[i][0];
            while (j>0){
                if (result[j]==-1){
                    result[j]=sequence[i][1];
                    count++;
                    maxProfit+=sequence[i][1];
                    break;
                }
                j--;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(count);
        ans.add(maxProfit);
        return ans;

    }
}
