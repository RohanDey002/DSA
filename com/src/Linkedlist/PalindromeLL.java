package Linkedlist;

public class PalindromeLL {
    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(2);
        Node fifth = new Node(1);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        System.out.println(isPrime(head));
    }

    static boolean isPrime(Node head){
        if (head== null|| head.next==null) return true;
        Node slow = head;
        Node fast = head;

        while (fast.next!=null && fast.next.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp = reverseLL(slow.next);
        Node first= head;
        Node second = temp;
        while (second!=null){
            if (first.data!=second.data){
                reverseLL(temp);
                return false;
            }
            second=second.next;
            first=first.next;
        }
        reverseLL(temp);
        return true;
    }
    static Node reverseLL(Node head){
        if(head==null || head.next==null) return head;
        Node newHead= reverseLL(head.next);
        Node font = head.next;
        font.next=head;
        head.next=null;
        return newHead;
    }
}
