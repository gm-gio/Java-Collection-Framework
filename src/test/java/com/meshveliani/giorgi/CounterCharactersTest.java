package com.meshveliani.giorgi;

import com.meshveliani.giorgi.counter.CounterCharacters;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CounterCharactersTest {
    @Test
    public void UniqueCharactersCounterCaching() {

        CounterCharacters counter = new CounterCharacters();
        String input = "Hello World!";

        Map<Character, Integer> charCount = counter.uniqueCharactersCounter(input);

        Map<Character, Integer> expectedCharCount = new LinkedHashMap<>();
        expectedCharCount.put('H', 1);
        expectedCharCount.put('e', 1);
        expectedCharCount.put('l', 3);
        expectedCharCount.put('o', 2);
        expectedCharCount.put(' ', 1);
        expectedCharCount.put('W', 1);
        expectedCharCount.put('r', 1);
        expectedCharCount.put('d', 1);
        expectedCharCount.put('!', 1);

        assertEquals(expectedCharCount, charCount);
    }
}
