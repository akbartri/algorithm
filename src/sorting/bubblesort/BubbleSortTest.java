package sorting.bubblesort;

import java.util.Random;

public class BubbleSortTest {
    public static void main(String[] args) {
        System.out.println("hi bubble sort");

        Random random = new Random();
        int[] arrays = new int[10];
        for(int i=0; i<arrays.length; i++) {
            arrays[i] = random.nextInt(1000);
        }

        System.out.println("before : ");
        print(arrays);

        bubbleSort();
        System.out.println("after : ");
        print(arrays);
    }

    private static void bubbleSort() {

    }

    private static void print(int[] arrays) {
        for(int array : arrays) {
            System.out.println(array);
        }
    }
}
