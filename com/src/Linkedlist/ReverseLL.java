package Linkedlist;

public class ReverseLL {
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
        Node newHead= reverselist(head);
        print(newHead);

    }

    // Recursive approach to reverse linked list
    static Node reverselist(Node head){
        if(head==null || head.next==null) return head;
        Node temp =reverselist(head.next);
        Node front = head.next;
        front.next=head;
        head.next=null;
        return temp;
    }

    static void print(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
