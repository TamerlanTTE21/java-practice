package Comparator.hometask_1;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int field;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        products.add(new Product("товар3", 200, 60));
        products.add(new Product("товар4", 100, 80));
        products.add(new Product("товар2", 1500, 9));
        products.add(new Product("товар1", 500, 8));
        ProductNameComparator nameComparator = new ProductNameComparator();
        ProductPriceComparator priceComparator = new ProductPriceComparator();
        ProductPopularityComparator popularityComparator = new ProductPopularityComparator();


        while (true) {
            System.out.println("Сортировать по");
            System.out.println("1. названию");
            System.out.println("2. стоимости");
            System.out.println("3. популярности");
            int field = scanner.nextInt();
            if (field == 1) {
                products.sort(nameComparator);
                System.out.println(products);
            } else if (field == 2) {
                products.sort(priceComparator);
                System.out.println(products);
            } else if (field == 3) {
                products.sort(popularityComparator);
                System.out.println(products);
            } else {
                System.out.println("Incorrect command");
            }


            System.out.println("1. по возрастанию");
            System.out.println("2. по убыванию");
            int order = scanner.nextInt();
            if (order == 1) {
                products.sort(nameComparator);
            } else if (order == 2) {
                products.sort(nameComparator.reversed());
            }

            // сортировка

            // распечатка списка
        }
    }
}
