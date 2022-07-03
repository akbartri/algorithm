package sorting.quicksort;

import java.util.Random;

public class QuickSortTest {
    public static void main(String[] args) {
        System.out.println("hi quick sort");

        Random random = new Random();
        int[] arrays = new int[10];
        for(int i = 0; i<arrays.length; i++) {
            arrays[i] = random.nextInt(1000);
        }

        System.out.println("before : ");
        print(arrays);

        quickSort(arrays,0, arrays.length-1);

        System.out.println("after : ");
        print(arrays);
    }

    private static void quickSort(int[] arrays, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex) {
            return;
        }

        int pivot = arrays[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (arrays[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (arrays[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(arrays, leftPointer, rightPointer);
        }

        swap(arrays, leftPointer, highIndex);

        //sorting left side of pivot
        quickSort(arrays,lowIndex,leftPointer-1);

        //sorting right side of pivot
        quickSort(arrays,leftPointer+1,highIndex);
    }

    private static void swap(int[] arrays, int index1, int index2) {
        int temp = arrays[index1];
        arrays[index1] = arrays[index2];
        arrays[index2] = temp;
    }

    private static void print(int[] arrays) {
        for(int array : arrays) {
            System.out.println(array);
        }
    }
}
