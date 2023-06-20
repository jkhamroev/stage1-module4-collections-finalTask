package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (String key : sourceMap.keySet()) {
            Set<String> set = map.getOrDefault(key.length(), new HashSet<>());
            set.add(key);
            map.put(key.length(), set);
        }
        return map;
    }
}
