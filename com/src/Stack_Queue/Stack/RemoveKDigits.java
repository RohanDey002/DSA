package Stack_Queue.Stack;

import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        String str = "10200";
        int k = 1;
        System.out.println(removeKdigits(str,k));
    }

    static String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        String str ="";
        for (int i = 0; i < num.length(); i++) {
            while (!st.isEmpty() && k>0 && num.charAt(i)<st.peek()){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while (k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }

        if(st.isEmpty()) return "0";
         while (!st.isEmpty()){
             str+=st.pop();
         }

         int i=str.length()-1;
         while (i>=0 && str.charAt(i)=='0'){
             i--;
         }
         str=str.substring(0,i+1);
         str = new StringBuilder(str).reverse().toString();
         if(str.length()==0) return "0";
         return str;

    }

//    static String reverse(String str){
//        String reversed ="";
//        int ind=str.length()-1;
//        while (ind>=0){
//           reversed+=str.charAt(ind);
//           ind--;
//        }
//        return reversed;
//    }
}
