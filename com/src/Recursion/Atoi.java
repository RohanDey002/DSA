package Recursion;

//Implement Atoi using recursion
public class Atoi {
    static void main(String[] args) {
        String atoiValue = "7326";
        System.out.println(atoi(atoiValue));
    }
    static int atoi(String str){
        if(str==null || str.isBlank()){
            return 0;
        }
        int sign = 1;
        int start = 0;
        if(str.charAt(0)=='-'){
            sign =-1;
            start =1;
        }
        int ans = recursiveAtoi(str.substring(start),str.length()-start);
        return sign*ans;
    }

    static int recursiveAtoi(String str , int n){
        if (n==0) return 0;

        int lastDigit =str.charAt(n-1)-'0';

        return (10* recursiveAtoi(str , n-1))+lastDigit;
    }
}
