package Graphs;

import java.util.*;

//Leetcode -->127
public class WordLadder {
    static void main(String[] args) {

        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
        System.out.println(ladderLength(beginWord,endWord,wordList));
    }
    static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair<String,Integer>> que = new LinkedList();
        Set<String> st = new HashSet<>(wordList);
        que.add(new Pair<>(beginWord,1));
        st.remove(beginWord);
        while (!que.isEmpty()){
            String word = que.peek().getKey();
            int step = que.peek().getValue();
            que.poll();

            if(word.equals(endWord)) return step;
            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                char original = arr[i];
                for (char ch ='a';ch<='z';ch++){
                    arr[i]=ch;
                    String newWord= new String(arr);
                    if(st.contains(newWord)){
                        st.remove(newWord);
                        que.add(new Pair<>(newWord,step+1));
                    }
                }
                arr[i]=original;
            }
        }


        return 0;
    }
  static   class Pair<K,V>{
        private K key;
        private V value;
        public Pair(K key,V value){
            this.key = key;
            this.value = value;
        }

     public K getKey() {
         return key;
     }

     public V getValue() {
         return value;
     }
 }

}

