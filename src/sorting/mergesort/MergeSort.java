package sorting.mergesort;

public class MergeSort {
    private int[] array;
    private int maxSize;
    private int currentSize;

    public int[] getArray() {
        return array;
    }

    public MergeSort(int size){
        array = new int[size];
        maxSize = size;
        currentSize = 0;
    }

    public boolean isFullArray() {
        return currentSize >= maxSize;
    }

    public void insert(int value) {
        if(!isFullArray()) {
            array[currentSize++] = value;
        }
    }

    public void print(int[] datas) {
        for(int data : datas) {
            System.out.println(data);
        }
    }

    public void startSort() {
//        int[] temp = new int[0];
        int left = currentSize;
        int right = maxSize-1;
        int mid = (maxSize-1)/2;

        if(currentSize < maxSize) {
            mergeSort(left,mid);
            mergeSort(mid+1,right);
            merge(left,mid,right);
        }
    }

    private void mergeSort(int start,int end) {

    }

    private void merge(int start, int mid, int end) {
        currentSize++;
    }

}
