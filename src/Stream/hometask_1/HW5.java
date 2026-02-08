package Stream.hometask_1;

import java.util.Arrays;
import java.util.List;

public class HW5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Иван", "Алина", "Ксения", "Дмитрий");
// Ожидаемый результат: ["Привет, Иван", "Привет, Алина", "Привет, Ксения", "Привет, Дмитрий"]
        List<String> result = names.stream()
                .map(x -> "Привет, " + x)
                .toList();
        System.out.println(result);
    }
}
