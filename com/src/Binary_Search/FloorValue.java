package Binary_Search;

public class FloorValue {
    public static void main(String[] args) {
        int[] arr ={1, 2, 8, 10, 10, 12, 19};
        System.out.println(findFloor(arr,9));

    }

    static int findFloor(int[] arr , int x){
        int low = 0, high = arr.length-1;
        int ans =-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<=x){
                ans = mid;
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return ans;
    }
}
