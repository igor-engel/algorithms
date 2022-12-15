package lesson2;

public class Circle {
    public static double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double getRadius(double area) {
        return Math.sqrt(area / Math.PI);
    }

    public static double getSectorArea(double angle, double radius) {
        return Math.PI * Math.pow(radius, 2) * (angle / 360);
    }

    public static void main(String[] args) {
        System.out.printf("Площадь круга = %.2f%n", getArea(10));
        System.out.printf("Длина окружности = %.2f%n", getCircumference(10));
        System.out.printf("Радиус окружности = %.2f%n", getRadius(100));
        System.out.printf("Площадь сектора = %.2f%n", getSectorArea(90, 10));
    }
}
