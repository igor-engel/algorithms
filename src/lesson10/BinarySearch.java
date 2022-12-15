package lesson10;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 8, 11, 12, 16, 38, 54, 121, 257, 990};

        int elementIndexRecursive = getElementIndexRecursive(array, 1, array.length - 1, 11);
        System.out.println("Индекс элемента, найденного при помощи рекурсии = " + elementIndexRecursive);

        int elementIndexCyclical = getElementIndexCyclical(array, 11);
        System.out.println("Индекс элемента, найденного при помощи цикла = " + elementIndexCyclical);
    }

    public static int getElementIndexRecursive(int[] array, int left, int right, int elementToSearch) {
        if (left > right) {
            return -1;
        }

        int middle = left + (right - left) / 2;

        if (array[middle] == elementToSearch) {
            return middle;
        }

        if (array[middle] > elementToSearch) {
            return getElementIndexRecursive(array, left, middle - 1, elementToSearch);
        }

        return getElementIndexRecursive(array, middle + 1, right, elementToSearch);
    }

    public static int getElementIndexCyclical(int[] array, int elementToSearch) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middleIndex = (left + right) / 2;

            if (array[middleIndex] < elementToSearch) {
                left = middleIndex + 1;
            } else if (array[middleIndex] > elementToSearch) {
                right = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }

        return -1;
    }
}
