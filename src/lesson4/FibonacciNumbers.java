package lesson4;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите порядковый номер числа Фибоначчи:");
        int ordinalFibonacciNumber = scanner.nextInt();

        if (ordinalFibonacciNumber == 0) {
            System.out.println("Число Фибоначчи №0 = 0");
            return;
        }

        long fibonacciNumber = 1;
        long previousFibonacciNumber = 0;
        int i = 1;

        while (i < ordinalFibonacciNumber) {
            long sum = previousFibonacciNumber + fibonacciNumber;
            previousFibonacciNumber = fibonacciNumber;
            fibonacciNumber = sum;

            i++;
        }

        System.out.println("Число Фибоначчи №" + ordinalFibonacciNumber + " = " + fibonacciNumber);
    }
}
