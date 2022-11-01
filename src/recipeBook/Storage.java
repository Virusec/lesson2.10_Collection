package recipeBook;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    static Map<String, Integer> storage = new HashMap<>();

    public static void addMap(String str, Integer value) {
        if (storage.containsKey(str) && value.equals(storage.get(str))) {
            throw new RuntimeException("Данный ключ-значение уже есть в хранилище!");
        }
        storage.put(str, value);
    }

}
