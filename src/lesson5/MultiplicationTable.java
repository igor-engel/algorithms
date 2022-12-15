package lesson5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("До какого числа хотите вывести таблицу умножения?");
        int multiplicationTableSize = scanner.nextInt();

        System.out.printf("%6c", 124);

        for (int i = 1; i <= multiplicationTableSize; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println();
        System.out.print("      ");

        for (int i = 1; i <= multiplicationTableSize; i++) {
            System.out.print("----");
        }

        System.out.println();

        for (int i = 1; i <= multiplicationTableSize; i++) {
            System.out.printf("%2d%4c", i, 124);

            for (int j = 1; j <= multiplicationTableSize; j++) {
                System.out.printf("%4d", i * j);
            }

            System.out.println();
        }
    }
}
