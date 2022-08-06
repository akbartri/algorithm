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
        System.out.println();

        bubbleSort(arrays);
        System.out.println("after : ");
        print(arrays);
    }

    private static void bubbleSort(int[] arrays) {
        for(int i=0; i<arrays.length; i++) {
            for(int j=0; j<arrays.length-1; j++) {
                if(arrays[j] > arrays[j+1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
    }

    private static void print(int[] arrays) {
        for(int array : arrays) {
            System.out.println(array);
        }
    }
}
