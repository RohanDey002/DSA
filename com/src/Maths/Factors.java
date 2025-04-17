package Maths;

import java.util.ArrayList;
import java.util.Collections;

public class Factors {
    public static void main(String[] args) {
         System.out.print(factors(12));
    }

    static ArrayList<Integer> factors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n); i++) {
            if(n%i==0){
                list.add(i);
                if (n/i!=i){
                    list.add(n/i);
                }
            }

        }
        Collections.sort(list);
        return list;

    }
}

//Time Complexity : O (sqrt(n))
//Spce Complexity:O(2*sqrt(n));