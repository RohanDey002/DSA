package Binary_Search;

import java.util.Arrays;

public class Mbauquets {
    public static void main(String[] args) {
       int[] bloomDay = {1,10,3,10,2};
       int m = 2, k = 2;
        System.out.println(minDays(bloomDay,m,k));
    }

    static int minDays(int[] bloomDay, int m, int k) {

        int len = bloomDay.length;

       if((long)m*k>len) return -1;

       int low = Arrays.stream(bloomDay).min().getAsInt();
       int high = Arrays.stream(bloomDay).max().getAsInt();

       while (low<=high){
           int mid = low+(high-low)/2;
           if(isPossibe(bloomDay,k,mid)>=m){
               high=mid-1;
           }else {
               low=mid+1;
           }
       }
       return low;
    }

    static int  isPossibe(int[] bloomDay , int k, int day){
        int count = 0 , bauquests =0;
        for (int bloom:bloomDay){
            if(bloom<=day){
                count++;
                if(count==k){
                    bauquests+=1;
                    count=0;
                }
            }else {
                count=0;
            }
        }
        return bauquests;
    }
}
