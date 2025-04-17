package Recursion;

//This program is about how to print number 1-n using recursion

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        System.out.print("Enter the n value:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1,n);
    }

    static void print(int val,int s){
        if (val>s) return;
        System.out.println(val);
        val++;
        print(val,s);
    }
}
