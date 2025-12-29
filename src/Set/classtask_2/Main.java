package Set.classtask_2;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<String> first = new HashSet<>();
        first.add("Astana");
        first.add("Almaty");
        first.add("Kokshetau");
        first.add("Taraz");
        Set<String> second = new HashSet<>();
        second.add("Shymkent");
        second.add("Taraz");
        second.add("Pavlodar");
        second.add("Astana");
        second.add("Almaty");
        Set<String> common = new HashSet<>();
// заполнить множество общими элементами
        for (String str : first) {
            if (second.contains(str)) {
                common.add(str);
            }
        }
        System.out.println(common); // [Taraz, Astana, Almaty]
    }
}
