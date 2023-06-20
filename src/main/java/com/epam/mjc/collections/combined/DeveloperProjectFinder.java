package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        projects.forEach((key, value) -> {
            if (value.contains(developer)) {
                result.add(key);
            }
        });
        result.sort(comparator);
        return result;
    }

    public Comparator<String> comparator = (s1, s2) -> {
        if (s1.length() < s2.length()) {
            return 1;
        }
        if (s1.length() > s2.length()) {
            return -1;
        }
        return s2.compareTo(s1);
    };
}
