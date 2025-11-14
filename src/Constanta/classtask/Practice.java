package Constanta.classtask;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Пожалуйста, введите сумму перевода в тенге.");
        // считайте сумму перевода
        int amount = scanner.nextInt();

        boolean isValid = TransactionValidator.isValidAmount(amount);  // добавьте вызов метод isValidAmount
        if (isValid)
            System.out.println("Спасибо! Ваш перевод на сумму " + amount + " тг. успешно выполнен.");
    }
}

