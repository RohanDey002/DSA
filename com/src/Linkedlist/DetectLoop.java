package Linkedlist;

//This problem can be solve using two approach 1.Hashing 2.Two pointer(in used this code)
//In Hashing we simply create hashmap HashMap<Node,Interger> mp = new HashMap<>()
//Then we assign (Node temp=head) and  run a while loop till (temp!=null) and if (mp.containsKey(temp))
//becomes true means there is loop in not find put that into HashMap

public class DetectLoop {
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
        fifth.next = third;
        System.out.println(detectLoop(head));
    }

    static boolean detectLoop(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast) return true;
        }
        return false;
    }
}
