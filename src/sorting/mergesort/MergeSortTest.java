package sorting.mergesort;

import java.util.Random;

public class MergeSortTest {
    public static void main(String[] args) {
        System.out.println("hi merge sort");

        int[] arrays = new int[10];
        Random random = new Random();

        for(int i = 0; i<arrays.length; i++) {
            arrays[i] = random.nextInt(1000);
        }

        System.out.println("before merge :");
        print(arrays);
        System.out.println();

        mergeSort(arrays);

        System.out.println("after merge :");
        print(arrays);
    }

    private static void print(int[] arrays) {
        for(int array : arrays) {
            System.out.println(array);
        }
    }

    private static void mergeSort(int[] arrays) {
        if(arrays.length < 2) {
            return;
        }

        int arraysLength = arrays.length;
        int mid = arraysLength / 2;

        int[] halfLeft = new int[mid];
        int[] halfRight = new int[arraysLength-mid];

        for(int i = 0; i<mid; i++) {
            halfLeft[i] = arrays[i];
        }

        for(int i = mid; i<arraysLength; i++) {
            halfRight[i-mid] = arrays[i];
        }

        mergeSort(halfLeft);
        mergeSort(halfRight);
        merge(arrays,halfLeft,halfRight);
    }

    private static void merge(int[] arrays, int[] halfLeft, int[] halfRight) {
        int leftSize = halfLeft.length, rightSize = halfRight.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (halfLeft[i] <= halfRight[j]) {
                arrays[k] = halfLeft[i];
                i++;
            } else {
                arrays[k] = halfRight[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            arrays[k] = halfLeft[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arrays[k] = halfRight[j];
            j++;
            k++;
        }
    }
}
