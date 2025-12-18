package Comparator.hometask_1;

import java.util.Comparator;
public class ProductNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.name, o2.name);
    }
}
