package Stream.classtask_2;

import java.util.List;

public class Main {
    static final int PHONE_LENGTH = 11;
    public static void main(String[] args) {
        List<String> nums = List.of(
                "+77025351245",
                "+7702535",
                "+77751572331",
                "+77029789678"
        );
        List<String> result = nums.stream()
                .filter(x -> x.length() >= PHONE_LENGTH)
                .map(x -> x.replace("+7", "8"))
                .toList();
        System.out.println(result);
    }
}
