package Binary_Search;

public class CountRotation {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4};
        System.out.println(findKRotation(arr));
    }

    static int findKRotation(int arr[]) {
        int low = 0 , high = arr.length-1;
        int ans = Integer.MAX_VALUE, index = -1;

        while (low<=high){
            int mid = low+(high-low)/2;

            if(arr[low]<=arr[high]){

                if (arr[low]<ans){

                    ans=arr[low];
                    index=low;
                }

                break;

            }
            if(arr[low]<= arr[mid]){

                 if(arr[low]<ans){

                     ans=arr[low];
                    index=low;

                 }

                low=mid+1;

            }else {

                if (arr[mid]<ans){

                    ans=arr[mid];
                    index=mid;

                }

                high=mid-1;

            }
        }

        return index;

    }
}
