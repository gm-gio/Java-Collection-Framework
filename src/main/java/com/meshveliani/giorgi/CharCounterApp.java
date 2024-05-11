package com.meshveliani.giorgi;

import com.meshveliani.giorgi.counter.CounterCharacters;
import com.meshveliani.giorgi.print.impl.CharCountAppPrint;

import java.util.Map;

public class CharCounterApp {
    public static void main(String[] args) {

        String input = "Hello Javas World!";

        CounterCharacters characters = new CounterCharacters();
        Map<Character, Integer> charCount = characters.uniqueCharactersCounter(input);

        CharCountAppPrint print = new CharCountAppPrint();
        print.printResult(charCount);

    }
}