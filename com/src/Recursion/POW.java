package Recursion;


// find the the n of x pow(x,n)
public class POW {
    public static void main(String[] args) {
        System.out.println(pow(2.000,-2147483648));
    }

    static double pow(double x,int n){
        double ans = 1.0;
        long temp = n;
        if (n<0) temp = -1 * temp;
        while (temp>0){
            if(temp%2==1){
                ans = ans*x;
                temp-=1;
            }
            else {
                x=x*x;
                temp=temp/2;
            }
        }
        if (n<0) ans = 1/ans;

        return  ans;
    }
}
