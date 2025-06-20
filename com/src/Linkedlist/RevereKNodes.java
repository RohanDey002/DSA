package Linkedlist;

public class RevereKNodes {
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
        Node newHead = revrseKnodes(head,2);
        print(newHead);
    }


    static  Node revrseKnodes(Node head,int k){
        Node temp = head;
        Node prevNode=null;
        while (temp!=null){
            Node kthNode = findKth(temp,k);
            if (kthNode==null){
                if (prevNode!=null) prevNode.next=temp;
                break;
            }

            Node nextNode = kthNode.next;
            kthNode.next=null;
            reverse(temp);
            if (temp==head){
                head=kthNode;
            }else {
               prevNode.next=kthNode;
            }
            prevNode=temp;
            temp=nextNode;
        }
        return head;
    }

    static Node findKth(Node temp,int k){
        k=k-1;
        while (temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }

    static Node reverse(Node temp){
        if (temp==null || temp.next==null) return temp;
        Node newtemp = reverse(temp.next);
        Node font = temp.next;
        font.next=temp;
        temp.next=null;
        return newtemp;
    }
    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
