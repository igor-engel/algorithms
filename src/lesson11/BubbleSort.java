package lesson11;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 285, 16, 7, 54, 121, 85, 9, 286};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        boolean isSorted = false;
        int unsortedArrayLength = array.length - 1;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < unsortedArrayLength; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }

            unsortedArrayLength--;
        }
    }
}
