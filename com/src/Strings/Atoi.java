package Strings;

public class Atoi {
    public static void main(String[] args) {
        String str = "-+42";
        System.out.println(myAtoi(str));
    }
    static  int myAtoi(String s){
        int n = s.length();
        int i = 0;
        while(i < n && s.charAt(i) == ' '){
            i++;
        }

        int sign = 1;
        if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+' )){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }

        int res = 0;
        while(i < n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if (res>(Integer.MAX_VALUE-digit)/10){
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }

            res=res*10+digit;
            i++;
        }

        return (res * sign);
    }
}
