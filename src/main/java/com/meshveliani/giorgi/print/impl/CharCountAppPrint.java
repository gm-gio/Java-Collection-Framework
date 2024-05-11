package com.meshveliani.giorgi.print.impl;

import com.meshveliani.giorgi.print.CharCountAppPrintInterface;

import java.util.Map;

public class CharCountAppPrint implements CharCountAppPrintInterface {
    public void printResult(Map<Character, Integer> charCount) {
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.printf("\"%s\" - %d%n", entry.getKey(), entry.getValue());
        }
    }

}
