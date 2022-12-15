package lesson5;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада:");
        double startDepositSum = scanner.nextDouble();

        while (startDepositSum == 0) {
            System.out.println("Сделайте вклад или возьмите кредит. Введите сумму ещё раз:");
            startDepositSum = scanner.nextDouble();
        }

        System.out.println("Введите процентную ставку:");
        double interestRate = scanner.nextDouble();

        System.out.println("Введите количество месяцев:");
        int monthsCount = scanner.nextInt();

        final int monthsInYearCount = 12;
        final int hundredPercent = 100;
        double finalDepositSum = startDepositSum;

        double moneyGrowth = 1 + interestRate / (monthsInYearCount * hundredPercent);

        for (int i = 1; i <= monthsCount; i++) {
            finalDepositSum *= moneyGrowth;
        }

        double finalProfit = finalDepositSum - startDepositSum;

        if (finalDepositSum > 0) {
            System.out.println("Итоговая сумма = " + finalDepositSum);
            System.out.println("Итоговая прибыль = " + finalProfit);
        } else {
            System.out.println("Итоговый долг = " + finalDepositSum);
            System.out.println("Прирост долга = " + finalProfit);
        }
    }
}
