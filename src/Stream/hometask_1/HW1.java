package Stream.hometask_1;

import java.util.Arrays;
import java.util.List;

public class HW1 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("кошка", "собака", "мышь", "слон", "птица");
        List<Integer> result1 = words.stream()
                .map(x -> x.length())
                .toList();
        System.out.println(result1);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        System.out.println(result2);

    }
}
