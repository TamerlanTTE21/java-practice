package Functional_Programming.classtask_3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Predicate - служит для проверки объекта
        // Function - преобразует объект
        // Consumer - для выполнения каких то действий над объектом
        // Supplier - для генераций объекта

        // boolean test(T t);

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> evenNums = getFilteredList(list, (num) -> num % 2 == 0);
        System.out.println(evenNums);

        List<Integer> oddNums = getFilteredList(list, (num) -> num % 2 != 0);
        System.out.println(oddNums);

        List<Integer> numsGreaterThan5 = getFilteredList(list, (num) -> num > 5);
        System.out.println(numsGreaterThan5);

        List<String> strings = List.of("java", "javascript", "php", "python", "golang");

        List<String> jStrings = getFilteredList(strings, (str) -> str.startsWith("j"));
        System.out.println(jStrings); // [java, javascript]

        List<String> lettersGT4 = getFilteredList(strings, (x) -> x.length() > 4); // получить строки у которых больше 4 символов
        System.out.println(lettersGT4); // [javascript, python, golang]
    }

    // функция высшего порядка
    static <T> List<T> getFilteredList(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T x : list) {
            if (predicate.test(x)) {
                result.add(x);
            }
        }
        return result;
    }
}


