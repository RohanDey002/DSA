package Recursion;


// find the the n of x pow(x,n)
// This problem is solved by binary exponentiation
public class POW {
    public static void main(String[] args) {
        System.out.println(pow(2.000,5));
    }
//Iterative way
//    static double pow(double x,int n){
//        double ans = 1.0;
//        long temp = n;
//        if (n<0) temp = -1 * temp;
//        while (temp>0){
//            if(temp%2==1){
//                ans = ans*x;
//                temp-=1;
//            }
//            else {
//                x=x*x;
//                temp=temp/2;
//            }
//        }
//        if (n<0) ans = 1/ans;
//
//        return  ans;
//    }
//Recursive way
    static double pow(double x,int n){
        long temp = n;
        if(n<0){
            x=1/x;
            temp = -temp;
        }
        return fastPower(x,temp);
    }

   static double fastPower(double x, long n){
        if (n==0) return  1;
        double half = fastPower(x,n/2);
        if (n%2==0) {
            return half*half;
        }
        else{
            return half*half*x;
        }
   }
}
