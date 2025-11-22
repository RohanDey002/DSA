package Binary_Search;

public class RowWithMaxOnes {
    static void main(String[] args) {
        int[][] arr ={{0,1,1,1}, {0,0,1,1}, {1,1,1,1}, {0,0,0,0}};
        System.out.println(rowWithMax1s(arr));
    }

    static int rowWithMax1s(int arr[][]) {
        // code here
        int max_ones = 0;
        int index =-1;
        for (int i = 0; i < arr.length; i++) {
            int count_ones = arr[i].length- findOnes(arr[i],1 );
            if(count_ones>max_ones){
                max_ones = count_ones;
                index = i;
            }
        }
        return index;

    }

    static int findOnes(int[] arr , int target){
        int low =0 , high = arr.length-1;
        int ans =arr.length;
        while (low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]==target){
                ans = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }

}


