package Comparator.classtask_1;
import java.util.Comparator;
public class ProductPopularityComparator implements Comparator<Product>{
    @Override
    public int compare(Product o1, Product o2) {
        return o1.popularity - o2.popularity;
    }
}
