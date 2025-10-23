package Binary_Search;
import java.util.Arrays;

//875. Koko Eating Bananas

public class KokoEatingBananas {
    public static void main(String[] args) {
         int[] arr = {30,11,23,4,20};
        System.out.println(minEatingSpeed(arr,6));
    }

    static int minEatingSpeed(int[] piles, int h) {
         int maxVal= Arrays.stream(piles).max().getAsInt();
         int low=1,high = maxVal;
         int ans = maxVal;
         while (low<=high){
             int mid = low+(high-low)/2;
             long hour = findTotalHour(piles,mid);
             if(hour<=h){
                 ans=mid;
                 high=mid-1;
             }else {
                 low=mid+1;
             }
         }
         return ans;
    }

    static long findTotalHour(int[] piles , int speed){
        long totalHour = 0;
        for (int bananas:piles){
            totalHour+=(int) Math.ceil((double) bananas/speed);
        }
        return totalHour;
    }
}
