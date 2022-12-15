package lesson3;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст:");
        int age = scanner.nextInt();

        if (age == 0) {
            System.out.println("Вы слишком малы.");
            return;
        }

        if (age > 112) {
            System.out.println("Вы слишком стары.");
            return;
        }

        if (age < 0) {
            System.out.println("Возраст не может быть отрицательным.");
            return;
        }

        int lastAgeDigit = age % 10;
        int twoLastAgeDigits = age % 100;

        if (lastAgeDigit == 1 && twoLastAgeDigits != 11) {
            System.out.println("Вам " + age + " год.");
        } else if (lastAgeDigit >= 2 && lastAgeDigit <= 4 && (twoLastAgeDigits < 10 || twoLastAgeDigits >= 20)) {
            System.out.println("Вам " + age + " года.");
        } else {
            System.out.println("Вам " + age + " лет.");
        }
    }
}
