package Linkedlist;

public class DeleteMiddleNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = null;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        Node newHead=deleteMiddleNode(head);
        print(newHead);
    }

    static Node deleteMiddleNode(Node head){
        if(head==null || head.next==null) return null;
        Node temp=head;
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            if (slow!=head) {
                temp = temp.next;
                slow = slow.next;
                fast = fast.next.next;
            }else {
                slow=slow.next;
                fast=fast.next.next;
            }
        }
        temp.next=slow.next;
        slow.next=null;
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
