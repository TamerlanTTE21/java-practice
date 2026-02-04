package Stream.classtask_1;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("Kazakhstan", "Germany", "Ukraine", "Japan");

        List<String> result = strings.stream()
                .map(x -> x.substring(0,3))
                .map(x -> x.toUpperCase())
                .toList();
        System.out.println(result);
    }
}
