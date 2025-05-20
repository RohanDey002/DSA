package Strings;

//Find the largest odd number in the string

public class LargestOdd {
    public static void main(String[] args) {
        String str ="468";
        String ans = largestOdd(str);
        System.out.println(ans);
    }

    static String largestOdd(String num){

        for (int i = num.length()-1; i >=0 ; i--) {
            if (num.charAt(i)%2!=0){
                return num.substring(0,i+1);
            }
        }
        return " ";
    }
}
