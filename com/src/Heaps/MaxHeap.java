package Heaps;

public class MaxHeap {
    int[] heap ;
    int capacity;
    int size;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        heap= new int[capacity];
        size=0;
    }

    private int parentN(int i){return (i-1)/2;}
    private int leftChild (int i){ return 2*i+1;}
    private int rightChild(int i){ return  2*i+2;}

    public void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public  void  insert( int value){
        if (size== capacity) throw new  RuntimeException("Heap is full ! ");
        heap[size] = value;
        size++;
        heapifyUp(size-1);
    }
    private void heapifyUp(int i){
        while (i>0 && heap[parentN(i)]<heap[i]){
            swap(i,parentN(i));
            i=parentN(i);
        }
    }
    public int getMax(){
        if (size==0) throw new RuntimeException("Heap is empty");
        return heap[0];
    }
    public int poll(){
        if(size==0) throw  new RuntimeException("Heap is empty");
        int max = heap[0];
        heap[0] = heap[size-1];
        size--;
        heapifyDown(0);
        return max;
    }
    private void heapifyDown(int i){
        int largest = i;
        int l = leftChild(i), r = rightChild(i);
        if(l< size && heap[l]> heap[largest]) largest=l;
        if(r<size && heap[r]> heap[largest])  largest=r;

        if(largest!=i){
            swap(i,largest);
            heapifyDown(largest);
        }


    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }


}
