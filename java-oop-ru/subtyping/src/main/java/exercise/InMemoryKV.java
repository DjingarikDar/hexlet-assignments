package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
class InMemoryKV implements KeyValueStorage {
    private Map<String, String> storage;

    public InMemoryKV(Map<String, String> map) {
        this.storage = new HashMap<>(map);
    }

    @Override
    public void set(String key, String value) {
        if (storage.containsKey(key)) {
            storage.replace(key, value);
        } else {
            storage.put(key, value);
        }
    }

    @Override
    public void unset(String key) {
        if (storage.containsKey(key)) {
            storage.remove(key);
        }
    }

    @Override
    public String get(String key, String defaultValue) {
        return storage.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(storage);
    }
}
// END
