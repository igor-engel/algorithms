package lesson4;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        int digitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            digitsSum += lastDigit;

            if (lastDigit % 2 != 0) {
                oddDigitsSum += lastDigit;
            }

            maxDigit = (maxDigit > lastDigit) ? maxDigit : lastDigit;

            number /= 10;
        }

        System.out.println("Сумма всех цифр = " + digitsSum);
        System.out.println("Сумма нечетных чисел = " + oddDigitsSum);
        System.out.println("Максимальное число = " + maxDigit);
    }
}
