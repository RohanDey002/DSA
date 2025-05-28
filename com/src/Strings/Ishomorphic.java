package Strings;

import java.util.Arrays;

public class Ishomorphic {
    public static void main(String[] args) {
        String s = "for";
        String t = "baa";
        System.out.println(ishomorphic(s,t));
    }

    static boolean ishomorphic(String s, String t){
        int[] StoT = new int[256];
        int[] TtoS = new  int[256];
        Arrays.fill(StoT,-1);
        Arrays.fill(TtoS,-1);
        for (int i = 0; i <s.length() ; i++) {
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if (StoT[ss]==-1 && TtoS[tt]==-1){
                StoT[ss]=tt;
                TtoS[tt]=ss;
            } else if (StoT[ss]!=tt || TtoS[tt]!=ss) {
                return false;
            }
        }
        return true;
    }
}
