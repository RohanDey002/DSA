package Stack_Queue.Stack;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(9);
        s.push(3);
        s.push(10);
        s.pop();
        s.push(20);

        System.out.println("Stack size ->"+ s.size());
    }
}
