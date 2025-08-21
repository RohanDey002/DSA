package Stack_Queue.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enQueue(2);
        q.enQueue(5);
        System.out.println("Queue top value is->"+q.top());
    }
}
