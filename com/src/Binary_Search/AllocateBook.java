package Binary_Search;

import java.util.Arrays;

public class AllocateBook {
    static void main(String[] args) {
        int[]  arr = {12,34,67,90};
        int k =2;
        System.out.println(findPages(arr,k));

    }
    static int findPages(int[] arr, int k) {
        int n = arr.length;
        if(n<k) return -1;
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        //int ans =-1;

        while (low<=high){
            int mid = low+(high-low)/2;
            if(foundStudents(arr,mid)>k){
                low=mid+1;
            }else {
                //ans=mid
                high=mid-1;
            }
        }
        return low;

    }

    static int foundStudents(int[] arr, int mid){
        int n = arr.length;
        int students=1;
        int pages = 0;
        for (int i = 0; i < n; i++) {
            if(pages+arr[i]<=mid){
                pages+=arr[i];
            }else {
                students+=1;
                pages=arr[i];
            }
        }

         return students;

    }


}



