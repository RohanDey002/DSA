package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;


//Generate binary digit of n length
public class GenerateBinaryString2 {
    public static void main(String[] args) {

        List<String> ans = generateBinaryStrings(3);
        for (String str : ans){
            System.out.println(str);
        }

    }
    static List<String> generateBinaryStrings(int n){
        List<String> results = new ArrayList<>();
        generate(n,"",results);
        return results;
    }
    static void  generate(int n,String current,List<String> results){
        if(current.length()==n){
            results.add(current);
            return;
        }

        generate(n,current+"0",results);

        generate(n,current+"1",results);
    }
}
