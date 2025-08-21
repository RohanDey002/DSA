package Stack_Queue.Queue;
//Queue using array
public class Queue {
    int [] arr ;
    int maxSize,start, end ,current;
    public Queue(int maxSize){
        this.maxSize=maxSize;
        arr = new int[maxSize];
        start=-1;
        end=-1;
        current=0;
    }
    void enQueue(int val){
        if (current==maxSize) {
            System.out.println("Queue is full cannot push..\nExiting...");
            System.exit(1);
        }

        if(end==-1){
            start=0;
            end=0;
        }else {
            end = (end+1)%maxSize;
        }
        arr[end]=val;
        System.out.println(val+" added into queue");
        current++;
    }
    int deQueue(){
        if (start==-1){
            System.out.println("Queue is empty cannot pop...\nExiting...");
            System.exit(1);
        }
        int popped = arr[end];
        if(current==1){
            start=-1;
            end=-1;

        }
        start=(start+1)%maxSize;
        current--;
        return popped;
    }

    int top(){
      if (start==-1){
          System.out.println("Queue is empty..");
          System.exit(1);
      }
      return arr[start];
    }
}
