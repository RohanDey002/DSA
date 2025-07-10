package Linkedlist;

import java.util.HashSet;

public class IntersectionNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node head2 = new Node(8);
        Node list2 =new Node(9);

        head2.next=list2;
        list2.next=fourth;
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        Node ans = getIntersection(head,head2);
        System.out.println(ans == null ? "NULL" : ans.data);
    }
//Using Hashing
//    static Node getIntersection(Node headA,Node headB){
//if(headA==null || headB == null) return null;
//        Node temp = headA;
//        HashSet<Node> st = new HashSet<>();
//        while (temp!=null){
//            st.add(temp);
//            temp=temp.next;
//        }
//        temp=headB;
//        while (temp!=null){
//            if(st.contains(temp)) return temp;
//            temp=temp.next;
//        }
//        return temp;
//    }
//optimize approach using two pointer
      static Node getIntersection(Node headA,Node headB){
        if(headA==null || headB == null) return null;
        Node t1=headA;
        Node t2 = headB;
        while (t1!=t2){
            t1=t1.next;
            t2=t2.next;
            if (t1==t2) return t1;
            if(t1==null) t1=headB;
            if (t2==null) t2=headA;
        }
        return t1;

     }
}
