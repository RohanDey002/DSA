package Linkedlist;

import java.util.HashMap;
import java.util.Map;

public class LLCycle2 {
    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = fourth;
        Node ans = detectCycle(head);
        if (ans!=null) System.out.println(ans.data);
        else System.out.println("null");
    }
    static Node detectCycle(Node head){
//        Map<Node,Integer> mp = new HashMap<>();
//        Node temp = head;
//        while (temp!=null){
//            if(mp.containsKey(temp)) return temp;
//            mp.put(temp,1);
//            temp=temp.next;
//
//        }
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (slow==fast){
                slow=head;
                while (slow!=fast){
                    slow=slow.next;
                    fast=fast.next;

                }
                return slow;
            }
        }
        return null;
    }
}
