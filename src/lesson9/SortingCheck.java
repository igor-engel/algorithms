package lesson9;

public class SortingCheck {
    public static void main(String[] args) {
        int[] array = {84, 10, 9, 7, 5, 4, 3, -84};

        boolean isInAscendingOrder = isInAscendingOrder(array);
        System.out.println("Массив отсортирован по возрастанию = " + isInAscendingOrder);

        boolean isInDescendingOrder = isInDescendingOrder(array);
        System.out.println("Массив отсортирован по убыванию = " + isInDescendingOrder);
    }

    public static boolean isInAscendingOrder(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isInDescendingOrder(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }

        return true;
    }
}
