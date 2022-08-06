package sorting.insertionsort;

import java.util.Random;

public class InsertionSortTest {
    public static void main(String[] args) {
        System.out.println("Hi Insertion Sort");

        int[] arrays = new int[10];
        Random random = new Random();

        for(int i=0; i<arrays.length; i++) {
            arrays[i] = random.nextInt(1000);
        }

        System.out.println("Before : ");
        print(arrays);

        insertionSort(arrays);

        System.out.println("after : ");
        print(arrays);
    }

    private static void insertionSort(int[] arrays) {
        for(int i=1; i< arrays.length; i++) {
            int currentValue = arrays[i];

            int j = i - 1;
            while (j >= 0 && arrays[j] > currentValue) {
                arrays[j+1] = arrays[j];
                j--;
            }
            arrays[j+1] = currentValue;
        }
    }

    private static void print(int[] arrays) {
        for(int array : arrays) {
            System.out.println(array);
        }
    }
}
