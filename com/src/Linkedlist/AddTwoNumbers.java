package Linkedlist;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // First linked list initialised
         Node head1 = new Node(5);
         Node first1= new Node(3);
         Node second1 = new Node(7);
         head1.next=first1;
         first1.next=second1;
         second1.next=null;

         //Second linked list initialised
        Node head2=new Node(8);
        Node first2=new Node(9);
        Node second2=new Node(2);
        Node third2=new Node(9);

        head2.next=first2;
        first2.next=second2;
        second2.next=third2;
        third2.next=null;

        Node answer = addTwoNumbers(head1,head2);
        print(answer);

    }

    static  Node addTwoNumbers(Node l1,Node l2){
        if(l1==null && l2 == null) return null;
        Node dummy = new Node(-1);
        Node current = dummy;
        int carry=0;
        while (l1!=null || l2!=null){
            int sum =0;
            if (l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if (l2!=null){
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            Node newNode = new Node(sum%10);
            current.next=newNode;
            current=current.next;
        }
        if(carry!=0){
            Node newNode = new Node(carry);
            current.next=newNode;
            current=current.next;
        }

        return dummy.next;
    }
    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
