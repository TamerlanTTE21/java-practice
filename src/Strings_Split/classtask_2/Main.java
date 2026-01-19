package Strings_Split.classtask_2;

public class Main {
    public static void main(String[] args) {
        String months = "ЯНВАРЬ+ФЕВРАЛЬ+МАРТ+АПРЕЛЬ+МАЙ+ИЮНЬ+ИЮЛЬ+АВГУСТ+СЕНТЯБРЬ+ОКТЯБРЬ+НОЯБРЬ+ДЕКАБРЬ";

// 1. Январь
// 2. Февраль
// 3. Март
// 4. Апрель
// 5. Май
// 6. Июнь
//...
        String[] arr = months.split("\\+");




        int index = 0;
        for (String str : arr) {
            index ++;

            String first = str.substring(0,1).toUpperCase();
            String second = str.substring(1).toLowerCase();
            String result = first + second;
            System.out.println(index + ". " + result);

        }
    }
}
