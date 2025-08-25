package Stack_Queue.Stack;

import java.util.Stack;

public class AstroidCollison {
    public static void main(String[] args) {
        int[] astroid = {5,-5};
        int [] ans = asteroidCollision(astroid);
        for (int val: ans){
            System.out.println(val);
        }

    }
    static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
             if(asteroids[i]>0) st.push(asteroids[i]);
             else {
                 while (!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(asteroids[i])){
                     st.pop();
                 }
                 if(!st.isEmpty() && st.peek()==Math.abs(asteroids[i])) {
                     st.pop();
                 }
                 else if (st.isEmpty() || st.peek()<0) {
                     st.push(asteroids[i]);
                 }
             }
        }

        int[] result = new int[st.size()];
        for (int i = st.size()-1; i >=0 ; i--) {
            result[i]=st.pop();
        }
        return result;
    }
}
