package Linkedlist;
//This problem is about to find the middle of the linkedlist using slow and fast pointer approach.

import javax.xml.transform.Source;
import java.util.LinkedList;

class Node{
    int data;
    Node next;

    public Node(Node next,int data) {
        this.next = next;
        this.data=data;
    }

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}
public class MiddleOfLL {
    public static void main(String[] args) {
      Node head =new Node(20);
      head.next = new Node(10);
      head.next.next = new Node(30);
      head.next.next.next= new Node(50);
      Node ans = findMiddle(head);
        System.out.println("The middle element is:"+ans.data);
    }

    static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!= null && fast.next!= null && slow!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
