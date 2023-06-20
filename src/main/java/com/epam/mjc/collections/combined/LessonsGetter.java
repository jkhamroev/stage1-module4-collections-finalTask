package com.epam.mjc.collections.combined;

import java.util.*;
import java.util.stream.Collectors;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        return timetable.values().stream().flatMap(Collection::stream).collect(Collectors.toSet());
    }
}
