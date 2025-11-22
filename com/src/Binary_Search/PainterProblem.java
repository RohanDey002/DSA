package Binary_Search;

import java.util.Arrays;

public class PainterProblem {
    static void main(String[] args) {
        int []arr= {10, 20, 30, 40,100};
        int k = 2;
        System.out.println(minimumTime(arr,k));
    }

    static int minimumTime(int[] arr ,int k){
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();

        while(low<=high){
            int mid = low+(high-low)/2;

            if(findPainters(arr,mid)>k){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return low;
    }

    static int findPainters(int[] arr, int time) {
        int n = arr.length;
        int painters =1 ;
        int totaltime =0 ;
        for (int i = 0; i <n ; i++) {
            if(totaltime+arr[i]<=time){
                totaltime+=arr[i];
            }else {
                painters+=1;
                totaltime = arr[i];
            }
        }
        return painters;
    }
}
