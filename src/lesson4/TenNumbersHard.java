package lesson4;

import java.util.Scanner;

public class TenNumbersHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное число:");
        int startNumber = scanner.nextInt();

        System.out.println("Введите конечное число:");
        int finishNumber = scanner.nextInt();

        System.out.println("Введите количество чисел в строке:");
        int numbersCountInString = scanner.nextInt();

        int printedNumbersInStringCount = 0;

        for (int i = startNumber; i <= finishNumber; i++) {
            System.out.printf("%4d", i);

            printedNumbersInStringCount++;

            if (printedNumbersInStringCount == numbersCountInString) {
                System.out.println();
                printedNumbersInStringCount = 0;
            }
        }
    }
}
