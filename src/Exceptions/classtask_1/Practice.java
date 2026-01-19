package Exceptions.classtask_1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Practice {
    public static void main(String[] args) {
        System.out.println(addToMap(new HashMap<>(), "test", "test"));
        System.out.println(addToMap(new HashMap<>(), null, null));

        System.out.println(addToMap(new TreeMap<>(), "test", "test"));
        System.out.println(addToMap(new TreeMap<>(), null, null));

        System.out.println(addToMap(Map.of(), "test", "test"));
    }

    public static Map<String, Object> addToMap(final Map<String, Object> storage,
                                               final String key, final Object value) {

           try {
               storage.put(key, value);
           } catch (NullPointerException e) {
               System.out.println("Реализация не поддерживает неинициализированные обьекты");
           }catch (UnsupportedOperationException e) {
               System.out.println("Реализация не поддерживает добавление новых обьектов");
           }
           return storage;

    }

}
