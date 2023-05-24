package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {
    public static void main(String[] args) {

    }

    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> cloneStorage = storage.toMap();
        cloneStorage.keySet()
                .forEach(storage::unset);
        cloneStorage.forEach((key, value) -> storage.set(value, key));
    }
}
// END
