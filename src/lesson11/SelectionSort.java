package lesson11;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {0, 45, 78, 4, 12, 16, 7, 54, 121, 85, 9, 1};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            array[minIndex] = array[i];
            array[i] = min;
        }
    }
}
