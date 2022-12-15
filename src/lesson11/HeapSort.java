package lesson11;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {45, 78, 4, 12, 16, 7, 54, 121, 85, 9};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        int heapLength = array.length;

        for (int i = heapLength / 2 - 1; i >= 0; i--) {
            shiftDown(array, heapLength, i);
        }

        for (int i = heapLength - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            shiftDown(array, i, 0);
        }
    }

    private static void shiftDown(int[] array, int length, int index) {
        int maxChildIndex;
        int temp;

        for (temp = array[index]; getLeftChild(index) < length; index = maxChildIndex) {
            maxChildIndex = getLeftChild(index);

            if (maxChildIndex != length - 1 && (array[maxChildIndex] < array[maxChildIndex + 1])) {
                maxChildIndex++;
            }

            if (temp < array[maxChildIndex]) {
                array[index] = array[maxChildIndex];
            } else {
                break;
            }
        }

        array[index] = temp;
    }

    private static int getLeftChild(int index) {
        return 2 * index + 1;
    }
}
