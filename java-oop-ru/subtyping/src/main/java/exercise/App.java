package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public interface App {
    public static void swapKeyValue(KeyValueStorage keyValueStorage) {
        Map<String, String> dataBase = keyValueStorage.toMap();
        String key;
        String value;
        for (var entry : dataBase.entrySet()) {
            key = entry.getValue();
            value = entry.getKey();
            keyValueStorage.unset(value);
            keyValueStorage.set(key, value);
        }
    }
}
// END
