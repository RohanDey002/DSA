package Linkedlist;

public class RotateLL {
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
        Node newHead = rotate(head,10);
        print(newHead);
    }

    static Node rotate (Node head , int k){
        if (head==null || head.next==null) return head;
        Node temp= head;
        Node lastNode =head;
        int length =1;
        while (temp.next!=null){
            temp=temp.next;
            length++;
        }
        k = k%length;
        if (k==0) return head;

        temp.next=head;
        int end = length-k;
        end-=1;
        while (end>0){
           lastNode=lastNode.next;
           end--;
        }
        head=lastNode.next;
        lastNode.next=null;

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
