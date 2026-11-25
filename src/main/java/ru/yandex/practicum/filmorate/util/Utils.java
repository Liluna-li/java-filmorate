package ru.yandex.practicum.filmorate.util;

import java.util.Map;

public class Utils {
    public static long getNextId(Map<Long, ?> registry) {
        long currentMaxId = registry.keySet()
                .stream()
                .mapToLong(id -> id)
                .max()
                .orElse(0);
        return ++currentMaxId;
    }
}
