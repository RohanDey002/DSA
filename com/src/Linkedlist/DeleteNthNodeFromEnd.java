package Linkedlist;

public class DeleteNthNodeFromEnd {
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
        fifth.next = null;
        Node newHead=deleteNthNode(head,2);
        print(newHead);
    }

    static Node deleteNthNode(Node head , int n){
       if(head==null || head.next==null) return  null;
        Node fast=head;
        Node slow=head;

        for (int i = 0; i < n; i++) {
            fast=fast.next;
        }
        if(fast==null) return  head.next;
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
