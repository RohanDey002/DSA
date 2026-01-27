package Recursion;

//A digit string is good if the digits (0-indexed) at even indices
// are even and the digits at odd indices are prime (2, 3, 5, or 7).
public class CountGoodNumbers {
    static final  long MOD = 1_000_000_007;
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(1924));

    }
    static int countGoodNumbers(long n) {
          long ans = solve(5,(n+1)/2)*solve(4,n/2);
          ans = ans%MOD;
          return (int) ans;


    }
    static long solve(long x, long n){
       if (n==0) return 1;
       if(n%2==0){
           return solve((x*x)%MOD,n/2);
       }else {
           return (x*solve((x*x)%MOD,(n-1)/2))%MOD;
       }

    }
}
