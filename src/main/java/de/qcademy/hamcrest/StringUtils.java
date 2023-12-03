package de.qcademy.hamcrest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StringUtils {

    public String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public String capitalize(String str) {
        if (str == null) {
            return null;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public String concatenate(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return null;
        }
        return str1 + str2;
    }

    public String[] splitIntoWords(String str) {
        if (str == null) {
            return new String[0];
        }

        String[] words = str.split("\\s+");

        return Arrays.stream(words)
                .filter(word -> !word.isEmpty())
                .toArray(String[]::new);
    }

    public Map<String, String> createWordMap(String str) {
        return Optional.ofNullable(str)
                .map(s -> s.split("\\s+"))
                .map(words -> {
                    Map<String, String> wordMap = new HashMap<>();
                    for (int i = 0; i < words.length; i++) {
                        String key = "key" + i;
                        wordMap.put(key, words[i]);
                    }
                    return wordMap;
                })
                .orElse(Map.of());
    }

    public List<String> createWordCollection(String str) {
        return Optional.ofNullable(str)
                .map(s -> Arrays.stream(s.split("\\s+")).toList())
                .orElse(List.of());
    }
}
