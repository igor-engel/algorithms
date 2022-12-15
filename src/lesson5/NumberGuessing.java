package lesson5;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите число от 1 до 100:");
        int enteredNumber = scanner.nextInt();

        int randomNumber = random.nextInt(100) + 1;
        int attemptsCount = 1;

        while (enteredNumber != randomNumber) {
            if (enteredNumber > randomNumber) {
                System.out.println("Ваше число больше загаданного, попробуйте ещё раз:");
            } else {
                System.out.println("Ваше число меньше загаданного, попробуйте ещё раз:");
            }

            enteredNumber = scanner.nextInt();

            attemptsCount++;
        }

        System.out.println("Ура! Вы угадали за " + attemptsCount + " попыток!");
    }
}
