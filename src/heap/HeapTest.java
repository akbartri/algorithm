package heap;

public class HeapTest {
    public static void main(String[] args) {
        System.out.println("####Testing Heap####");

        //given data
        Heap testHeap = new Heap(5);
        testHeap.insert(20);
        testHeap.insert(10);
        testHeap.insert(12);
        testHeap.insert(17);
        testHeap.insert(9);
        testHeap.insert(18);

        testHeap.display();
    }
}
