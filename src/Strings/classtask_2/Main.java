package Strings.classtask_2;

public class Main {
    public static void main(String[] args) {
        System.out.println(capitalize("hello")); // Hello
        System.out.println(capitalize("hELLO")); // Hello
        System.out.println(capitalize("HELLO")); // Hello
        System.out.println(capitalize("HeLlO")); // Hello
    }

    public static String capitalize(String str) {
        String first = str.substring(0,1).toUpperCase();
        String last = str.substring(1).toLowerCase();
        String result = first + last;

        return result;

    }
}

