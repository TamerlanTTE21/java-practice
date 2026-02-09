package Stream.hometask_1;

import java.util.Arrays;
import java.util.List;

public class HW6 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Иван Иванов", "Алина Петрова", "Ксения Сидорова", "Дмитрий Кузнецов");
        List<String> result = names.stream()
                .map(x -> x.substring(0,1).toUpperCase())
                .toList();
        System.out.println(result);
    }
}
