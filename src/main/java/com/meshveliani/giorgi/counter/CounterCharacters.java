package com.meshveliani.giorgi.counter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class CounterCharacters implements CounterCharacterInterface {
    private final Map<String, Map<Character, Integer>> cache = new HashMap<>();

    @Override
    public Map<Character, Integer> uniqueCharactersCounter(String input) {

        if (cache.containsKey(input)) {
            return cache.get(input);
        }
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char inputChar : input.toCharArray()) {
            charCount.put(inputChar, charCount.getOrDefault(inputChar, 0) + 1);
        }
        cache.put(input, charCount);

        return charCount;
    }
}
