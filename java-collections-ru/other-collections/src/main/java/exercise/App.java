package exercise;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> dict1, Map<String, Object> dict2) {
        Set<String> keyOfDict1 = new HashSet<>(dict1.keySet());
        Set<String> keyOfDict2 = new HashSet<>(dict2.keySet());
        Set<String> unionKey = new TreeSet<>();
        unionKey.addAll(keyOfDict1);
        unionKey.addAll(keyOfDict2);
        LinkedHashMap<String, String> diffDict = new LinkedHashMap<>();
        for (String key : unionKey) {
            if (dict1.containsKey(key) && dict2.containsKey(key)) {
                if (dict1.get(key).equals(dict2.get(key))) {
                    diffDict.put(key, "unchanged");
                } else {
                    diffDict.put(key, "changed");
                }
            } else if (dict1.containsKey(key)) {
                diffDict.put(key, "deleted");
            } else {
                diffDict.put(key, "added");
            }
        }
        return diffDict;
    }
}
//END
