package com.maciejfec;

import java.util.HashMap;
import java.util.Map;

public class SharedDictionary {

    private final Map<String, Object> sharedMap = new HashMap<>();

    public void add(String key, Object value) {

        sharedMap.put(key, value);
    }

    public Object read(String key) {

        return sharedMap.get(key);
    }

    public boolean containsKey(String key) {

        return sharedMap.containsKey(key);
    }
}
