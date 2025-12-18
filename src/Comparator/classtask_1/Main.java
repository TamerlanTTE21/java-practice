package Comparator.classtask_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("товар3", 200, 60));
        products.add(new Product("товар4", 100, 80));
        products.add(new Product("товар2", 1500, 9));
        products.add(new Product("товар1", 500, 8));
        ProductPopularityComparator popularityComparator = new ProductPopularityComparator();
        products.sort(popularityComparator);
        System.out.println(products);
    }
}
