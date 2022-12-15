package lesson11;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {45, 78, 4, 12, 16, 7, 54, 121, 85, 9};
        int left = 0;
        int right = array.length - 1;

        quickSort(array, left, right);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = left + (right - left) / 2;
        int pivot = array[middle];
        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort(array, left, j);
        }

        if (right > i) {
            quickSort(array, i, right);
        }
    }
}
