package Binary_Search;

public class UpperBound {
    public static void main(String[] args) {
        int [] arr = {2, 3, 7, 10, 11, 11, 25};
        System.out.println(upperBound(arr,100));
    }

    static int upperBound(int [] arr , int target){
        int start = 0, end=arr.length-1;
        int ans = arr.length;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                ans=mid;
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return ans;
    }
}
