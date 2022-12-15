package lesson2;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество этажей:");
        int floorsCount = scanner.nextInt();

        System.out.println("Введите количество подъездов:");
        int entrancesCount = scanner.nextInt();

        System.out.println("Введите номер квартиры:");
        int apartmentNumber = scanner.nextInt();

        // квартир на этаже
        int apartmentsCountOnFloor = 4;
        // квартир в подъезде
        int apartmentsCountInEntrance = floorsCount * apartmentsCountOnFloor;
        // квартир в доме всего
        int apartmentsCountInBuilding = entrancesCount * apartmentsCountInEntrance;

        if (apartmentNumber > apartmentsCountInBuilding) {
            System.out.println("Квартиры с таким номером нет в доме");
            return;
        }

        int entranceNumber = (apartmentNumber - 1) / apartmentsCountInEntrance + 1;
        System.out.println("Номер подъезда = " + entranceNumber);

        int floorNumber = (apartmentNumber - 1) % apartmentsCountInEntrance / apartmentsCountOnFloor + 1;
        System.out.println("Номер этажа = " + floorNumber);

        int indexApartmentPosition = apartmentNumber % apartmentsCountOnFloor;

        if (indexApartmentPosition == 0) {
            System.out.println("Квартира ближняя справа");
        } else if (indexApartmentPosition == 1) {
            System.out.println("Квартира ближняя слева");
        } else if (indexApartmentPosition == 2) {
            System.out.println("Квартира дальняя слева");
        } else {
            System.out.println("Квартира дальняя справа");
        }
    }
}
