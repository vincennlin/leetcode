package com.vincennlin.leetcode.hashtable.medium.determineiftwostringsareclose;

import java.util.*;

// 1657
class Solution {
    public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> word1Map = new HashMap<>();
        Map<Character, Integer> word2Map = new HashMap<>();

        for (char c : word1.toCharArray()) {
            word1Map.put(c, word1Map.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            word2Map.put(c, word2Map.getOrDefault(c, 0) + 1);
        }

        if (!word1Map.keySet().equals(word2Map.keySet())) {
            return false;
        }

        List<Integer> word1Freq = new ArrayList<>(word1Map.values());
        List<Integer> word2Freq = new ArrayList<>(word2Map.values());
        Collections.sort(word1Freq);
        Collections.sort(word2Freq);

        return word1Freq.equals(word2Freq);
    }
}
