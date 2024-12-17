package com.vincennlin.leetcode.heap.medium.constructstringwithrepeatlimit;

import java.util.*;

// 2182
class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        Map<Character, Integer> charFreqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
        }

        Queue<Character> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.addAll(charFreqMap.keySet());

        StringBuilder sb = new StringBuilder();

        while (!maxHeap.isEmpty()) {
            char c = maxHeap.poll();
            int freq = charFreqMap.get(c);

            int use = Math.min(freq, repeatLimit);
            for (int i = 0; i < use; i++) {
                sb.append(c);
            }

            charFreqMap.put(c, freq - use);

            if (charFreqMap.get(c) > 0 && !maxHeap.isEmpty()) {
                char nextChar = maxHeap.poll();
                sb.append(nextChar);
                charFreqMap.put(nextChar, charFreqMap.get(nextChar) - 1);
                if (charFreqMap.get(nextChar) > 0) {
                    maxHeap.add(nextChar);
                }
                maxHeap.add(c);
            }
        }

        return sb.toString();
    }
}