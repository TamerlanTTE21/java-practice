package Strings_Split.classtask_1;

public class Main {
    public static void main(String[] args) {
        String str = "1,4,6,8,9";
        String[] arr = str.split(",");
        int total = 0;
        for (String s : arr) {
            System.out.println(s);
            total += Integer.parseInt(s);
        }
        System.out.println(total);
    }
}
