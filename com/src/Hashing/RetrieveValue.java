package Hashing;

import java.util.HashMap;
import java.util.Map;

//Craete a HashMap and retrieve value from it and count the frequency or occurence
public class RetrieveValue {
    public static void main(String[] args) {
        int arr[] = {2,8,5,4,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int freq = 0;
            if(map.containsKey(key)) freq= map.get(key);
            freq +=1;
            map.put(key,freq);
        }

        for (Map.Entry<Integer,Integer> in:map.entrySet()){
            System.out.println(in.getKey()+"-->"+ in.getValue());
        }
    }
}
