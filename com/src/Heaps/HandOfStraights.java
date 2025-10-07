package Heaps;


//846. Hand of Straights

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class HandOfStraights {
    public static void main(String[] args) {
          int[] hand ={1,4,2,5,3,4};
          int groupSize = 3;
        System.out.println(isNStraightHand(hand,groupSize));
    }
// Using TreeMap
    // complexity: T.C-> O(nlogn)+O(n*groupSize)  S.C -> O(n)
    static boolean isNStraightHand(int[] hand, int groupSize) {
      int n = hand.length;
      if(n%groupSize!=0) return false;

        TreeMap<Integer,Integer> mp = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(hand[i],mp.getOrDefault(hand[i],0)+1 );
        }

        while (!mp.isEmpty()){
            int current = mp.firstKey();
            for (int i = 0; i < groupSize; i++) {
                if(!mp.containsKey(current+i)){
                    return false;
                }

                mp.put(current+i,mp.get(current+i)-1);
                if(mp.get(current+i)==0){
                    mp.remove(current+i);
                }
            }
        }

        return true;
    }

  //Using HashMap + min-heap (PriorityQueue)
  // // complexity: T.C-> O(nlogn)+O(n*groupSize)  S.C -> O(n+m)
//    static boolean isNStraights(int[] hand , int groupSize){
//        int n = hand.length;
//
//        if (n % groupSize != 0) return false;
//
//
//        Map<Integer, Integer> count = new HashMap<>();
//        for (int card : hand) {
//            count.put(card, count.getOrDefault(card, 0) + 1);
//        }
//
//
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>(count.keySet());
//
//
//        while (!minHeap.isEmpty()) {
//            int first = minHeap.peek();
//
//
//            for (int i = 0; i < groupSize; i++) {
//                int card = first + i;
//
//                if (!count.containsKey(card)) {
//                    return false;
//                }
//
//
//                count.put(card, count.get(card) - 1);
//
//
//                if (count.get(card) == 0) {
//                    count.remove(card);
//
//
//                    if (card == minHeap.peek()) {
//                        minHeap.poll();
//                    }
//                }
//            }
//        }
//
//        return true;
//    }
}
