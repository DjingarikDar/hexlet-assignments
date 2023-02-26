package exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static <K, V> List<Map<K, V>> findWhere(List<Map<K, V>> list, Map<K, V> map) {
        List<Map<K, V>> resList = new ArrayList<>();
        for (Map<K, V> itr : list) {
            Set<Entry<K, V>> union = new HashSet<>(itr.entrySet());
            union.addAll(map.entrySet());
            if (union.equals(itr.entrySet())) {
                resList.add(itr);
            }
        }
        return resList;
    }
}
//END
