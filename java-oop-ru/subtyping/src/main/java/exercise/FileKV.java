package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class FileVK implements KeyValueStorage {
    private final String strFilePath;

    public FileVK(String strFilePath, Map<String, String> storage) {
        this.strFilePath = strFilePath;
        Utils.writeFile(strFilePath, Utils.serialize(storage));
    }

    @Override
    public void set(String key, String value) {
        Map<String, String> storage = new HashMap<>(toMap());
        if (storage.containsKey(key)) {
            storage.replace(key, value);
        } else {
            storage.put(key, value);
        }
        Utils.writeFile(strFilePath, Utils.serialize(storage));
    }

    @Override
    public void unset(String key) {
        Map<String, String> storage = new HashMap<>(toMap());
        if (storage.containsKey(key)) {
            storage.remove(key);
        }
        Utils.writeFile(strFilePath, Utils.serialize(storage));
    }

    @Override
    public String get(String key, String defaultValue) {
        Map<String, String> map = new HashMap<>(toMap());
        return map.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return Utils.unserialize(Utils.readFile(strFilePath));
    }
}
// END

