package lesson3;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день месяца:");
        int day = scanner.nextInt();

        if (day > 31 || day < 1) {
            System.out.println("Неверный день месяца.");
            return;
        }

        System.out.println("Введите номер месяца:");
        int month = scanner.nextInt();

        if (month > 12 || month < 1) {
            System.out.println("Неверный номер месяца.");
            return;
        }

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        int daysInMonthCount;

        if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && month == 2) {
            daysInMonthCount = 29;
        } else if (month == 2) {
            daysInMonthCount = 28;
        } else if ((month <= 7 && month % 2 != 0) || (month > 7 && month % 2 == 0)) {
            daysInMonthCount = 31;
        } else {
            daysInMonthCount = 30;
        }

        if (day > daysInMonthCount) {
            System.out.println("В этом месяце " + daysInMonthCount + " дней.");
            return;
        }

        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        if (day < daysInMonthCount) {
            nextDay++;
        } else {
            nextDay = 1;
            nextMonth++;
        }

        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }

        System.out.printf("%02d.%02d.%02d", nextDay, nextMonth, nextYear);
    }
}
