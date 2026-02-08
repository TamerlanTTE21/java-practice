package Stream.hometask_1;


import java.util.Arrays;
import java.util.List;


public class HW2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result2 = numbers.stream()
                .map(x -> {
                    if (x % 2 == 0) return 0;
                    return x;
                })
                .toList();
        System.out.println(result2);

    }
}

