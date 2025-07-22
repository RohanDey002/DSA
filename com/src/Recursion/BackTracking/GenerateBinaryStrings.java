package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;


//Given an integer n, return all binary strings of length n that do not contain consecutive 1s.
// Return the result in lexicographically increasing order.
public class GenerateBinaryStrings {
    public static void main(String[] args) {
         List<String> result = generateBinaryStrings(3);
         for (String s : result){
             System.out.println(s);
         }
    }

    static List<String> generateBinaryStrings(int n){
        List<String> results = new ArrayList<>();
        generate(n,"",'0',results);
        return results;
    }
    static void  generate(int n,String current,char last,List<String> results){
        if(current.length()==n){
            results.add(current);
            return;
        }

        generate(n,current+"0",'0',results);

        if (last!='1'){
            generate(n,current+"1",'1',results);
        }
    }
}
