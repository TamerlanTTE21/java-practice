package Data;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();

        System.out.println("Введите месяц");
        int month = scanner.nextInt();

        System.out.println("Введите день");
        int day = scanner.nextInt();

        LocalDate localDate1 = LocalDate.of(year, month, day);
        LocalDate localDate2 = LocalDate.now();

        if (localDate1.isAfter(localDate2)) {
            System.out.println("эта дата в будущем");
        } else if (localDate1.isBefore(localDate2)) {
            System.out.println("эта дата в прошлом");
        } else if (localDate1.isEqual(localDate2)) {
            System.out.println("дата в настоящем");
        }
    }
}
