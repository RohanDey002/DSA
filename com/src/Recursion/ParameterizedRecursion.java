package Recursion;

import java.util.Scanner;

//This code is about how to calculate sum passing parameter value in recursion method
public class ParameterizedRecursion {
    public static void main(String[] args) {
        System.out.print("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n,0));
        System.out.println(fact(n,1));
    }
    static int sum(int n,int sum){
       if(n<1){
           return sum;
       }
      return sum(n-1,sum+n);
    }
    static int fact(int n,int fact){
        if(n<1){
            return fact;
        }
        return fact(n-1,fact*n);
    }
}
