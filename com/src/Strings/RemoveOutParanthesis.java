package Strings;


//Remove the outer parentheses [Leetcode 1021]

public class RemoveOutParanthesis {
    public static void main(String[] args) {
        String st = "(()())(())";
       String output = removeOut(st);
        System.out.println(output);
    }

    public static String removeOut(String s){
        StringBuilder result = new StringBuilder();
        int cout = 0;
        for (char c : s.toCharArray()){
            if (c==')') cout--;
            if (cout!=0) result.append(c);
            if (c=='(') cout++;

        }
        return result.toString();
    }
}
