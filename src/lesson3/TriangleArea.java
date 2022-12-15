package lesson3;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату \"X\" первой точки:");
        double x1 = scanner.nextDouble();

        System.out.println("Введите координату \"Y\" первой точки:");
        double y1 = scanner.nextDouble();

        System.out.println("Введите координату \"X\" второй точки:");
        double x2 = scanner.nextDouble();

        System.out.println("Введите координату \"Y\" второй точки:");
        double y2 = scanner.nextDouble();

        System.out.println("Введите координату \"X\" третьей точки:");
        double x3 = scanner.nextDouble();

        System.out.println("Введите координату \"Y\" третьей точки:");
        double y3 = scanner.nextDouble();

        double straightLineCheck1 = (x1 - x3) * (y2 - y3);
        double straightLineCheck2 = (x2 - x3) * (y1 - y3);

        double epsilon = 1.0e-10;

        if (Math.abs(straightLineCheck1 - straightLineCheck2) <= epsilon) {
            System.out.println("Точки лежат на одной прямой.");
            return;
        }

        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

        double semiPerimeter = (a + b + c) / 2;

        double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        System.out.printf("Площадь треугольника = %.2f", area);
    }
}
