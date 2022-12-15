package lesson10;

import java.util.Scanner;

public class EuclideanAlgorithmRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        if (number1 == 0 && number2 == 0) {
            System.out.println("НОД искать нельзя.");
            return;
        }

        int greatestCommonDivisor = getGreatestCommonDivisor(number1, number2);
        System.out.println("НОД = " + greatestCommonDivisor);
    }

    public static int getGreatestCommonDivisor(int number1, int number2) {
        if (number2 == 0) {
            return Math.abs(number1);
        }

        return getGreatestCommonDivisor(number2, number1 % number2);
    }
}
