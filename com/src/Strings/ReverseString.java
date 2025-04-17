package Strings;

//This problem state that reverse a string , remove starting and ending spaces also remove extra spaces between two words
public class ReverseString {
    public static void main(String[] args) {
        String st = "  The   sky  ";
        System.out.println(revserse(st));
    }
//    public static String revserse(String s){
//        String arr[] = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (int i = arr.length-1; i >=0 ; i--) {
//            if(arr[i].length()==0) continue;
//
//            if(sb.length()==0) {
//                sb.append(arr[i]);
//            }
//            else {
//                sb.append(" ");
//                sb.append(arr[i]);
//            }
//
//        }
//       return sb.toString();
//    }

    public static String revserse(String s){
        StringBuilder res = new StringBuilder();
        int Si = s.length()-1;
        while (Si>=0){
            while (Si>=0 && s.charAt(Si)==' '){
                Si --;
            }
            if(Si<0) break;
            int Ei = Si;
            while (Si>=0 && s.charAt(Si)!=' '){
                Si--;
            }
            if(res.length()==0){
                res.append(s.substring(Si+1,Ei+1));
            }else {
                res.append(' ');
                res.append(s.substring(Si+1,Ei+1));
            }
        }
        return res.toString();
    }
}
