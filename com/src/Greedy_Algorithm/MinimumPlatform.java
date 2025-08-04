package Greedy_Algorithm;

import java.util.Arrays;

public class MinimumPlatform {
    public static void main(String[] args) {
     int arr[] = {900, 940, 950, 1100, 1500, 1800};
     int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr,dep));
    }

    static int findPlatform(int arr[], int dep[]) {
      Arrays.sort(arr);
      Arrays.sort(dep);
      int i=1,j=0;
      int platform=1;
      int result=1;
      while (i<arr.length&& j<arr.length){
          if(arr[i]>dep[j]){
              platform--;
              j++;
          } else if (arr[i]<=dep[j]) {
              platform++;
              i++;
          }
          if (platform>result) result=platform;
      }
      return result;
    }
}
