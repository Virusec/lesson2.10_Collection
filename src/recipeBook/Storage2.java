package recipeBook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage2 {
    static final Map<String, List<Integer>> storage2 = new HashMap<>();
    static final Map<String, Integer> newSt2 = new HashMap<>();

    public static Map<String, Integer> getTransformMap() {
        for (var keySet : storage2.keySet()) {
            Integer sum = 0;
            List<Integer> temp = storage2.get(keySet);
            for (Integer integerSum : temp) {
                sum += integerSum;
            }
            newSt2.put(keySet, sum);
        }
        return newSt2;
    }
}
