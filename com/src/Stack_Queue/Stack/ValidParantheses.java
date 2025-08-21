package Stack_Queue.Stack;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String parantheses = "{}()";
        System.out.println(isValid(parantheses));
    }
    static boolean isValid(String s){
        Stack <Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(' || s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
            }else {
                if(st.isEmpty()) return false;
                if((s.charAt(i)==')' && st.peek()=='(') ||(s.charAt(i)==']' && st.peek()=='[') ||
                        (s.charAt(i)=='}' && st.peek()=='{')) st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
}
