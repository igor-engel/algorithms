package lesson3;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициент \"a\":");
        double a = scanner.nextDouble();

        System.out.println("Введите коэффициент \"b\":");
        double b = scanner.nextDouble();

        System.out.println("Введите коэффициент \"c\":");
        double c = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs(a) <= epsilon && Math.abs(b) > epsilon) {
            double x = -(c / b);
            System.out.println("x = " + x);
            return;
        }

        if (Math.abs(a) <= epsilon && Math.abs(c) > epsilon) {
            System.out.println("Решения нет");
            return;
        }

        if (Math.abs(a) <= epsilon) {
            System.out.println("x = любое число");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant < -epsilon) {
            System.out.println("Решения нет");
        } else if (Math.abs(discriminant) <= epsilon) {
            double x = -(b / (2 * a));
            System.out.println("x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
