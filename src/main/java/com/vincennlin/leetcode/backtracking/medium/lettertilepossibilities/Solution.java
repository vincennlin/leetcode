package com.vincennlin.leetcode.backtracking.medium.lettertilepossibilities;

import java.util.HashMap;
import java.util.Map;

// 1079
class Solution {
    int result;

    public int numTilePossibilities(String tiles) {
        Map<Character, Integer> letterFreqMap = new HashMap<>();
        result = 0;

        for (char c : tiles.toCharArray()) {
            letterFreqMap.put(c, letterFreqMap.getOrDefault(c, 0) + 1);
        }

        backtracking(letterFreqMap, true, 0, tiles.length());

        return result;
    }

    private void backtracking(Map<Character, Integer> letterFreqMap, boolean isEmpty, int length, int targetLength) {
        if (length == targetLength) {
            if (!isEmpty) {
                result++;
            }
            return;
        }

        for (char c : letterFreqMap.keySet()) {
            int freq = letterFreqMap.get(c);
            if (freq > 0) {
                letterFreqMap.put(c, freq - 1);
                backtracking(letterFreqMap, false, length + 1, targetLength);
                letterFreqMap.put(c, freq);
            }
        }

        backtracking(letterFreqMap, isEmpty, length + 1, targetLength);
    }
}