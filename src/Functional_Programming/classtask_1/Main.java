package Functional_Programming.classtask_1;

public class Main {
    public static void main(String[] args) {
        WordEditor wordEditor = str -> {
            String first = str.substring(0,1).toUpperCase();
            String second = str.substring(1).toLowerCase();
            String result = first + second;
            return result;
            };
        String result = wordEditor.operation("heLLO");
        System.out.println(result);

    }
}
interface WordEditor {
    String operation (String str);
}