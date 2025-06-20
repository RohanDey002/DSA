package Strings;

public class RotateString {
    public static void main(String[] args) {
        String str ="abcde";
        String goal ="abde";
        System.out.println(rotateString(str,goal));
    }
    static boolean rotateString(String s , String goal){
        if(s.length()!=goal.length()) return false;
        String rotated = s+s;
        if(rotated.contains(goal)) return true;
        return false;


//                if (s.length() != goal.length()) return false;
//
//                for (int i = 0; i < s.length(); i++) {
//                    String rotated = s.substring(i) + s.substring(0, i);
//                    if (rotated.equals(goal)) return true;
//                }
//
//                return false;



    }
}
