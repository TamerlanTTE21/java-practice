package Set.classtask_1;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        List<String> allPurchases = List.of(
                "яблоки",
                "молоко",
                "колбаса",
                "огурцы",
                "сок",
                "хлеб",
                "виноград",
                "молоко",
                "йогурт",
                "хлеб",
                "пельмени"
        );
        Set<String> uniquePurchases = new HashSet<>();
        for (String str : allPurchases) {

            uniquePurchases.add(str);
        }
        System.out.println(allPurchases.size()); // 11
        System.out.println(uniquePurchases.size()); // 9
    }
}
