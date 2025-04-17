package Recursion;

import java.util.Scanner;

public class BacktrackingPrint {
    public static void main(String[] args) {
        System.out.print("Enter the n value:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n,n);
    }
    static void print(int val,int s){
        if (val<1) return;
        print(val-1,s);
        System.out.println(val);

    }
}
