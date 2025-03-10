package com.vincennlin.leetcode.slidingwindow.medium.countofsubstringscontainingeveryvowelandkconsonantsii;

import java.util.HashMap;
import java.util.Map;

// 3306
class Solution {
    public long countOfSubstrings(String word, int k) {
        return atLeastK(word, k) - atLeastK(word, k + 1);
    }

    private long atLeastK(String word, int k) {
        long numValidSubStrings = 0;
        int start = 0;
        int end = 0;
        Map<Character, Integer> vowelCount = new HashMap<>();
        int consonantCount = 0;

        while (end < word.length()) {
            char newLetter = word.charAt(end);

            if (isVowel(newLetter)) {
                vowelCount.put(newLetter, vowelCount.getOrDefault(newLetter, 0) + 1);
            } else {
                consonantCount++;
            }

            while (vowelCount.size() == 5 && consonantCount >= k) {
                numValidSubStrings += word.length() - end;
                char startLetter = word.charAt(start);

                if (isVowel(startLetter)) {
                    vowelCount.put(startLetter, vowelCount.get(startLetter) - 1);
                    if (vowelCount.get(startLetter) == 0) {
                        vowelCount.remove(startLetter);
                    }
                } else {
                    consonantCount--;
                }

                start++;
            }

            end++;
        }

        return numValidSubStrings;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u';
    }
}