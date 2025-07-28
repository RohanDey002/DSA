package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class FruitInBaskets {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2};
        System.out.println(totalfruits(arr));
    }

    static  int totalfruits(int[] fruits){
        int right=0;
        int left=0;
        int maxfruits=0;
        Map<Integer,Integer>mp =new HashMap<>();
        while (right<fruits.length){
            mp.put(fruits[right],mp.getOrDefault(fruits[right],0)+1);
            if (mp.size()>2){
                mp.put(fruits[left],mp.get(fruits[left])-1);
                if (mp.get(fruits[left])==0) mp.remove(fruits[left]);
                left++;
            }

            maxfruits=Math.max(right-left+1,maxfruits);
            right++;
        }

        return maxfruits;
    }
}
