package Binary_Search;

public class KthMissing {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int k = 2;
        System.out.println(findKthPositive(arr,k));
    }

    static int findKthPositive(int[] arr, int k) {
        int low =0 , high = arr.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            int missing = arr[mid]-(mid+1);
            if (missing<k) low=mid+1;
            else high=mid-1;
        }

        return low+k;
    }
}
