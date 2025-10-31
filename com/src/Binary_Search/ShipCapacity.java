package Binary_Search;

import java.util.Arrays;

//Leetcode - 1011. Capacity To Ship Packages Within D Days
public class ShipCapacity {
    public static void main(String[] args) {
        int[] arr = {3,2,2,4,1,4};
        System.out.println(shipWithinDays(arr,3));
    }

    static int shipWithinDays(int[] weights, int days) {
          int low = Arrays.stream(weights).max().getAsInt();
          int high = Arrays.stream(weights).sum();

          while (low<=high){
              int mid = low+(high-low)/2;
              if(findDays(weights,mid)<=days){
                  high=mid-1;
              }else {
                  low=mid+1;
              }
          }
          return low;
    }

    static int findDays(int[] weights , int capcity){
        int days=1;
        int load = 0;
        for (int i = 0; i < weights.length; i++) {
            load+=weights[i];
            if(load>capcity){
                days+=1;
                load=weights[i];
            }
        }
        return days;
    }
}
