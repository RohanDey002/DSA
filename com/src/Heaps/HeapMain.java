package Heaps;

public class HeapMain {
    public static void main(String[] args) {
       // MaxHeap mxheap = new MaxHeap(5);
        MinHeap mnheap = new MinHeap(5);
        mnheap.insert(5);
        mnheap.insert(3);
        mnheap.insert(10);
        mnheap.printHeap();
        System.out.println(mnheap.getMin());
        mnheap.poll();
        System.out.println(mnheap.getMin());
        mnheap.insert(20);
        mnheap.printHeap();
    }
}
