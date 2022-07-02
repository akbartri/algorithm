package heap;

public class Heap {
    private Node[] heap;
    private int maxSize;
    private int currentSize;

    public Heap(int size) {
        maxSize = size;
        currentSize = 0;
        heap = new Node[size];
    }

    public boolean isFullHeap() {
        return currentSize >= maxSize;
    }

    public void insert(int data) {
        if(!isFullHeap()) {
            Node node = new Node(data);
            heap[currentSize] = node;
            swap(currentSize++);
        }
    }

    public void swap(int index) {
        int parent = (index-1)/2;
        Node child = heap[index];

        while(index > 0 && heap[parent].getData() < child.getData()) {
            heap[index] = heap[parent];
            index = parent;
            parent = (parent-1)/2;
            heap[index] = child;
        }
    }

    public void display() {
        for(int i = 0; i<currentSize; i++) {
            System.out.print(heap[i].getData()+" ");
        }
    }
}
