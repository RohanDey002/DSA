package Stack_Queue.Stack;
//Stack using array
public class Stack {
    int[] arr ;
    int top ,maxsize;

    public Stack(int maxsize){
        this.maxsize = maxsize;
        arr = new int[maxsize];
        top=-1;
    }
    void push(int val){
        if (top==maxsize){
            System.out.println("Stack is full cannot push.\nExiting...");
            System.exit(1);
        }
        top++;
        arr[top] = val;
    }

    int pop(){
        int val = arr[top];
        top--;
        return val;
    }
    int top(){
        return arr[top];
    }
    int size(){
        return top+1;
    }

}



