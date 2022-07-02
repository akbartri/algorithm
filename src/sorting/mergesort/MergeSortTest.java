package sorting.mergesort;

public class MergeSortTest {
    public static void main(String[] args) {
        System.out.println("hi merge sort");
        MergeSort mergeSort = new MergeSort(10);
        mergeSort.insert(10);
        mergeSort.insert(12);
        mergeSort.insert(11);
        mergeSort.insert(14);
        mergeSort.insert(13);
        mergeSort.insert(19);
        mergeSort.insert(20);
        mergeSort.insert(18);
        mergeSort.insert(16);
        mergeSort.insert(17);

        System.out.println("BEFORE MERGE SORT");
        mergeSort.print(mergeSort.getArray());

        mergeSort.startSort();
        System.out.println("AFTER MERGE SORT");
        mergeSort.print(mergeSort.getArray());

    }
}
