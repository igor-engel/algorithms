package lesson11;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {45, 78, 4, 12, 16, 7, 54, 121, 85, 9};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentNumber = array[i];
            int j = i - 1;

            while (j >= 0 && currentNumber < array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = currentNumber;
        }
    }
}
