package Binary_Search;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls= {1, 2, 4, 8, 9};
        int k = 3;
        System.out.println(aggressiveCows(stalls,k));
    }

    static int aggressiveCows(int[] stalls, int k) {
        int n =  stalls.length;
        Arrays.sort(stalls);
        int low =1, high = stalls[n-1]-stalls[0];
        while (low<=high){
            int mid= low+(high-low)/2;
            if(isPossible(stalls,mid,k)==true){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return high;

    }

    static boolean isPossible(int[] stalls , int dist , int k){
        int n  = stalls.length;
        int cows = 1 ;
        int last = stalls[0];

        for (int i = 1; i <n ; i++) {
            if(stalls[i]-last>=dist){
                cows+=1;
                last= stalls[i];
            }
        }

        if(cows>=k) return true;

        return false;
    }
}
