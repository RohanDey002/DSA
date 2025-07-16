package Binary_Search;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(53));

    }

    // Finding square root using binary search
    static double sqrt(int n){
        int left = 1; int right = n; double ans =0;
        while (left<=right){
            int mid = left+(right-left)/2;
            if ((long) mid *mid <=n){
                ans = mid;
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return ans;
    }

}
