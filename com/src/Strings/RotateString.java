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
    }
}
