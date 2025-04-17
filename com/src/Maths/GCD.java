package Maths;

public class GCD {
    public static void main(String[] args) {
        System.out.print(gcd(26, 13));
    }

    static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
         if (a>b) a=a%b;
        else b=b%a;
        }
        if (a==0) return b;
        return a;
    }
}
//Time Complexity: O(logΦ(min(a,b)))
//Space Complexity:1